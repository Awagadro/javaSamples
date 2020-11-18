package javaSamples.sorting;

import java.util.Arrays;

public class SimpleSortStart {
	public static void main(String[] args) {
		int[] array = { 10, 2, 10, 3, 1, 2, 5 };
		System.out.println("Unsorted array: " + Arrays.toString(array));

		// int[] sorted = bubleSort(array);// Пузырьковая сортировка
		// int[] sorted = selectionSort(array); // Сортировка выбором
		int[] sorted = insertionSort(array); // Сортировка вставками
		// int[] sorted = shuttleSort(array); // челночная сортировка

		System.out.println("Sorted array: " + Arrays.toString(sorted));

	}

	private static int[] shuttleSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				swap(array, i, i - 1);
				for (int z = i - 1; (z - 1) >= 0; z--) {
					if (array[z] < array[z - 1]) {
						swap(array, z, z - 1);
					} else {
						break;
					}
				}
			}
		}
		return array;
	}

	private static int[] insertionSort(int[] array) {
		for (int left = 0; left < array.length; left++) {
			int value = array[left];
			int i = left - 1;
			for (; i >= 0; i--) {
				if (value < array[i]) {
					array[i + 1] = array[i];
				} else {
					break;
				}
			}
			array[i + 1] = value;
		}
		return array;
	}

	private static int[] selectionSort(int[] array) {
		for (int left = 0; left < array.length; left++) {
			int minInd = left;
			for (int i = left; i < array.length; i++) {
				if (array[i] < array[minInd]) {
					minInd = i;
				}
			}
			swap(array, left, minInd);

		}
		return array;
	}

	private static int[] bubleSort(int[] array) {
		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					swap(array, i, i - 1);
					needIteration = true;
				}
			}
		}
		return array;
	}

	private static void swap(int[] array, int ind1, int ind2) {
		int temp = array[ind1];
		array[ind1] = array[ind2];
		array[ind2] = temp;

	}
}
