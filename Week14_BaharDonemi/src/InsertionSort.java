class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 9, 7, 6, 15, 17, 5, 10, 11 };

		InsertionSort ob = new InsertionSort();
		ob.insertionSort(array);
		ob.printArray(array);

	}

	void insertionSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
