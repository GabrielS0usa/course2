package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String path = "C:\\GitHub\\workspaceEclipse\\in\\in.csv";
		String path2 = "C:\\GitHub\\workspaceEclipse\\in\\out\\summary.csv";
		String[] prod = null;
		List<Products> products = new ArrayList<>();

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

			String line = bf.readLine();

			while (line != null) {
				prod = line.split(",");
				String name = prod[0];
				String price = prod[1];
				String qtd = prod[2];

				products.add(new Products(name, price, qtd));

				line = bf.readLine();
			}

			for (Products pd : products) {
				pd.summary(path2);
				System.out.println(pd.toString());
			}

		} catch (IOException e) {
			System.out.println("Error msg: " + e.getMessage());
		} finally {

			sc.close();
		}
	}
}
