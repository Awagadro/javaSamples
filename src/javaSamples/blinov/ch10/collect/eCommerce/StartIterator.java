package javaSamples.blinov.ch10.collect.eCommerce;

import java.util.ArrayList;
import java.util.List;

public class StartIterator {

	public static void main(String[] args) {
		ArrayList<Order> orders = new ArrayList<Order>() {
			{
//				add(new Order(231, 12f));
//				add(new Order(389, 2.9f));
//				add(new Order(217, 1.7f));
			}
		};
		FindOrder fo = new FindOrder();
		List<Order> res = fo.findBiggerAmountOrder(10f, orders);
		System.out.println(res);
	}

}
