package javaSamples.array;

public class StarterIntFindNumber {

	public static void main(String[] args) {
		// находит индекс числа из массива
		int[] array = { 1, 2, 3, 4, 5 };
		int j = 7; // вернет -1, т.к. в массиве нет числа 7

		int myIndex = findNumber(array, j);
		System.out.println(myIndex);

	}

	private static int findNumber(int[] arr, int j) {
		int index = -1;

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == j) {
				index = k;
			}
		}

		return index;

	}
}
