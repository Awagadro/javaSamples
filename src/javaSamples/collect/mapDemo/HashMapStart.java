package javaSamples.collect.mapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStart {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>(3) {
			{
				this.put("Сырок", 3);
				this.put("Пряник", 5);
				this.put("Молоко", 1);
				this.put("Колбаса", 10);
				this.put("Хлеб", 1);
			}
		};
		System.out.println(hm);
		hm.put("Пряник", 4); // замена или добавление при отсутствии ключа
		System.out.println(hm + "после замены значения");
		Integer a = hm.get("Хлеб");
		System.out.println(a + " - найден по ключу 'Хлеб'");

		hm.remove("Колбаса"); // удаление по ключу
		System.out.println(hm + "после удаления элемента");

		System.out.println("Вывод хэш-таблицы с помощью методов интерфейса Map.Entry<K,V>");
		Set<Map.Entry<String, Integer>> setv = hm.entrySet();
		System.out.println(setv);

		Iterator<Map.Entry<String, Integer>> i = setv.iterator(); // создание итератора
		while (i.hasNext()) { // hasNext()- метод итератора
			Map.Entry<String, Integer> me = i.next(); // next() - тоже метод итератора
			System.out.println(me.getKey() + " : " + me.getValue());
		}

		Set<Integer> val = new HashSet<Integer>(hm.values()); // создать Set из значений
		System.out.println(val);
	}

}
