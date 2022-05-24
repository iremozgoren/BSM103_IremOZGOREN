
public class rangeAlgorithm {

	public static void main(String[] args) {
		int numbers[] = { 17, 29, 11, 4, 20, 8 };
		System.out.println(range3(numbers));

	}

	public static int range(int numbers[]) {
		int maxDiff = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				int diff = Math.abs(numbers[j] - numbers[i]);
				if (diff > maxDiff) {
					maxDiff = diff;
				}
			}
		}

		return maxDiff;

	}

	public static int range2(int numbers[]) {
		int maxDiff = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int diff = Math.abs(numbers[j] - numbers[i]);
				if (diff > maxDiff) {
					maxDiff = diff;
				}

			}
		}
		return maxDiff;
	}

	public static int range3(int numbers[]) {
		int max = numbers[0];
		int min = max;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];

			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max - min;
	}

}
