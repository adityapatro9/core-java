package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsInitial {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(9, 1, 10, 11, 0, 5);

		al.stream().sorted().forEach(System.out::println);
		System.out.println("-------------------");
		// Normal For loop
		for (int i = 0; i < 6; i++) {
			System.out.println(al.get(i));
		}

		System.out.println("-------------------");
		// Advanced for loop
		for (int i : al) {
			System.out.println(i);
		}

		System.out.println("-------------------");
		// ForEach
		al.forEach(n -> System.out.println(n));

	}

}
