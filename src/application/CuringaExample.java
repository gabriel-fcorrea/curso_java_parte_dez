package application;

import java.util.Arrays;
import java.util.List;

public class CuringaExample {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3);
		printList(myInts);
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);

	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
