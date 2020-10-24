package javaSamples.blinov.ch10.collect.eCommerce;

import java.util.Iterator;
import java.util.List;

public class Order implements Iterable<Item> {
	private int ordreId;
	private List<Item> items;

	public Order(int ordreId, List<Item> items) {
		this.ordreId = ordreId;
		this.items = items;
	}

	public int getOrdreId() {
		return ordreId;
	}

	public List<Item> getItems() {
		return items;
	}

	public boolean add(Item e) {
		return items.add(e);
	}

	public Item get(int index) {
		return items.get(index);
	}

	public Item remove(int index) {
		return items.remove(index);
	}

	// создание итератора
	@Override
	public Iterator<Item> iterator() {
		return items.iterator();
	}
}
