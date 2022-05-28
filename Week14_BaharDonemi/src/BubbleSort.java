
 class BubbleSort {

	public static void main(String[] args) {
		int array[] = {10,8,6,4,2,20};
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(array);
		ob.pointArray(array);
		

	}
	void bubbleSort(int [] array) {
		for(int i = 0; i < array.length-1; i++) {
			for(int index = 0; index < array.length-1;index++) {
				if(array[index] > array[index+1]) {
					int temp = array[index];
					array[index] = array[index+1];
					array[index+1] = temp;
					
				}
			}
		}
	}
	void pointArray(int [] array) {
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
