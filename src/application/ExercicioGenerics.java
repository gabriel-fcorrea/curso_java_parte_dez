package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class ExercicioGenerics {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		String path = "C:\\\\temp\\\\ex1.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String productCsv = br.readLine();
			while (productCsv != null) {
				String[] fields = productCsv.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				productCsv = br.readLine();
			}

			Product p = CalculationService.max(list);
			System.out.println("Most Expansive: ");
			System.out.println(p);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
