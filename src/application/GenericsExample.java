package application;

import java.util.Scanner;

import services.PrintService;

public class GenericsExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>(); // instanciando do tipo generics

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt(); // necessário que a variável seja do mesmo tipo instanciado
			ps.addValue(value);
		}

		ps.print();
		System.out.println("First: " + ps.first());

		sc.close();
	}

}
