package collections;

import java.util.TreeSet;

public class Duplicate {

	public static void main(String[] args) {

		TreeSet<Product> pro = new TreeSet<>();

		pro.add(new Product("HP", 1));
		pro.add(new Product("Dell", 2));
		pro.add(new Product("MacBook", 3));
		// adding a duplicate product name
		pro.add(new Product("HP", 4));
		// adding a duplicate product ID
		pro.add(new Product("Samsung", 3));
		pro.add(new Product("Lenovo", 5));

		for (Product p : pro) {
			System.out.println(p);
		}

	}

}
