package collections;

public class Product implements Comparable<Product> {

	private String product_name;
	private int product_id;

	Product(String product_name, int product_id) {
		this.product_id = product_id;
		this.product_name = product_name;
	}

	private String getName() {
		return product_name;
	}

	public int getId() {
		return product_id;
	}

	public int compareTo(Product p) {
		if (product_id == p.getId()) {
			return 0;
		} else if (product_name.compareTo(p.getName()) < 0) {
			return -1;
		} else {
			return -1;
		}
	}

	public String toString() {
		return product_name + " - " + product_id;
	}

}
