package multithreading;

class Broker{
	int Stock=10;
	int[] buy;
	int[] sell;
			
	Broker(int[] buy,int[] sell){
		this.buy=buy;
		this.sell=sell;
	}

	public synchronized void  buy() {
		for(int i=0;i<buy.length;i++) {
			if(Stock<buy[i]) {
				try {
					System.out.println("Stock Not available --> waiting");
					wait();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			Stock-=buy[i];
			System.out.println("Bought -> "+buy[i]+" Stock -> "+Stock);
		
		}
	}

	public synchronized void sell() {
		for(int i=0;i<sell.length;i++) {
			Stock+=sell[i];
			System.out.println("Sold -> "+sell[i]+" Stock -> "+Stock);
			System.out.println("Udpated Stock");
			notify();
			
		}
	}
}

public class BuyerSeller {
	public static void main(String[] args) {
		int[] buy= {6,20,100,200,300}; // 626
		int[] sell= {12,8,50,250,500,311}; // array + stock = 1141

		Broker b=new Broker(buy,sell);

		Thread t1=new Thread() {
			public void run() {
				b.buy();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				b.sell();
			}
		};

		t1.start();
		t2.start();
	}

}
