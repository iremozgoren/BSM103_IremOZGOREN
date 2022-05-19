import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Lutfen bir string giriniz: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		String reverseString = "";

		int length = inputString.length();

		for (int index = length - 1; index >= 0; index--) {
			reverseString = reverseString + inputString.charAt(index);
		}
		if (inputString.equals(reverseString)) {
			System.out.println("Girilen string palindromdur...");
		} else {
			System.out.println("Girilen string palindrom deðildir...");
		}

	}

}
