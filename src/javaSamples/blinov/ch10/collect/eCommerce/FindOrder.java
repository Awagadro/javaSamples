package javaSamples.blinov.ch10.collect.eCommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindOrder {
	public List<Order> findBiggerAmountOrder(float bigAmount, List<Order> orders) {
		ArrayList<Order> bigPrices = new ArrayList<Order>();
		Iterator<Order> it = orders.iterator();
		while (it.hasNext()) {
			Order current = it.next();
//			if (current.getAmount() >= bigAmount) {
			bigPrices.add(current);
		}
//		}

		return bigPrices;

	}
}
