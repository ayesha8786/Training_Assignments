package Lambda;

import java.util.*;
import java.lang.annotation.*;
import java.util.stream.Stream;

public class Order {
	float price;
	String ordername;
	String orderaddress;
	String orderstatus;

	public Order(float price, String ordername, String orderaddress, String orderstatus) {
		this.price = price;
		this.ordername = ordername;
		this.orderaddress = orderaddress;
		this.orderstatus = orderstatus;
	}

	public static void main(String[] args) {
		ArrayList<Order> list = new ArrayList<Order>();
		list.add(new Order(10000, "OneplusPhone", "Visakhapatnam", "ACCEPTED"));
		list.add(new Order(20000, "Mi Phone", "Hyderabad", "COMPLETED"));
		list.add(new Order(40000, "Samsung Phone", "Bangalore", "ACCEPTED"));
		list.add(new Order(650000, "iPhone", "Chennai", "ACCEPTED"));
		list.add(new Order(18000, "Redmi", "Mumbai", "COMPLETED"));

		Stream<Order> filtereddata = list.stream().filter(o -> o.price > 10000);

		filtereddata.forEach(orders -> {
			System.out.println(orders.ordername + ":" + orders.price);
			System.out.println(orders.orderstatus);

		});
	}

}
