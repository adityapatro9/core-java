package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsInitial {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(1);
		al.add(10);
		al.add(11);
		al.add(0);
		al.add(5);
		
		al.stream().sorted().forEach(System.out::println);

	}

}
