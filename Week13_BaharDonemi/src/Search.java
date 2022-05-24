
public class Search {

	public static void main(String[] args) {
		int[] numbers = { 63, 18, 51, 37, 29, 49, 42, 11 };
		int[] numbers2 = { 11, 18, 29, 37, 42, 49, 51, 63 };

		//int index = indexOf2(numbers2, 51);
		int index = binarySearch(numbers2,29);

		if (index != -1)
			System.out.println("Elemanin indeksi: " + index);
		else
			System.out.println("Eleman bulunamadi...");

	}

	public static int indexOf2(int numbers[], int target) {
		int i = 0;
		while (i < numbers.length && numbers[i] <= target) {
			if (numbers[i] == target)
				return i;
			else
				i++;

		}
		return -1;
	}

	public static int indexOf(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			return i;
		}
		return -1;

	}

	public static int binarySearch(int numbers[], int target) {
		int min = 0;
		int max = numbers.length - 1;

		while (min <= max) {
			int mid = (max + min) / 2;
			if (numbers[mid] == target)
				return mid;
			else if (numbers[mid] < target)
				min = mid + 1;
			else
				max = mid - 1;
		}
		return -1;
	}
	public static int binarySearchR(int numbers[], int target,int min,int max) {
		if(min > max) {
			return -1;
		}
		else{
			int mid = (min+max)/2;
			if(numbers[mid] == target)
				return mid;
			else if(numbers[mid] < target)
				return binarySearchR(numbers,target,mid+1,max);
			else
				return binarySearchR(numbers,target,min,mid-1);
		}
	}

}
