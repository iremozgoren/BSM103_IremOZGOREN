
class SelectionSort {

	public static void main(String[] args) {
		int array[] = {12,36,25,11,23,35,47,82};
		SelectionSort ob = new SelectionSort();
		ob.sort(array);
		System.out.println("Sirali dizi: ");
		ob.printArray(array);

	}
	void sort(int array[]) {
		for(int index = 0; index < array.length-1; index++) {
			int min_index = index;
			for(int j = index+1; j < array.length; j++) {
				if(array[j] < array[min_index]) {
					min_index = j;
				}
			}
			int temp = array[min_index];
			array[min_index] = array[index];
			array[index] = temp;
		}
		
	}
	void printArray(int array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}

}
