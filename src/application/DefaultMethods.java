package application;

import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;

public class DefaultMethods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService bis = new UsaInterestService(1.0);
		double payment = bis.payment(amount, months);

		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));

		sc.close();

	}
}
