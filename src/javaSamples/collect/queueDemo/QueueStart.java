package javaSamples.collect.queueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStart {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("element 1");
		queue.add("element 2");
		queue.add("element 3");
		System.out.println(queue.offer("element 0")); // добавить элемент, add() - кидается исключениями
		System.out.println(queue.peek()); // вершина очереди, element() - кидается исключениями
		System.out.println(queue.poll()); // удалить элемент, remove() - кидается исключениями
		System.out.println(queue);
	}

}
