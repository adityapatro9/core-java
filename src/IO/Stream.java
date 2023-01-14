package IO;

import java.io.*;

public class Stream {

	public static void main(String[] args){
		System.out.println("Enter a Number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t = 0;
		try {
			t = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("System = "+t);
	}

}
