
public class MergeSort {
	void sort(int[] array, int left, int right) {
		if (left < right) {
			int middle = left + (right - left) / 2;
			sort(array, left, middle);
			sort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
	}

	void merge(int[] array, int left, int middle, int right) {
		int number1 = middle - left + 1;
		int number2 = right - middle;

		int[] L = new int[number1];
		int[] R = new int[number2];

		for (int i = 0; i < number1; i++) {
			L[i] = array[left + i];
		}
		for (int i = 0; i < number2; i++) {
			R[i] = array[middle + 1 + i];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < number1 && j < number2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < number1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < number2) {
			array[k] = R[j];
			j++;
			k++;
		}

	}

	void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		MergeSort ob = new MergeSort();
		int[] array = { 38, 27, 43, 3, 9, 82, 10 };
		ob.sort(array, 0, array.length - 1);
		ob.printArray(array);

	}

}
