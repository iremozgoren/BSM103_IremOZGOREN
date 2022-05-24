import java.util.*;
import java.io.*;

public class kelimeAratanKod {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String kelime = scan.next();
		foundWords(kelime);

	}

	public static String foundWords(String kelime) throws FileNotFoundException {
		Scanner input = new Scanner(new File("test.txt"));
		ArrayList<String> words = new ArrayList<String>();
		while (input.hasNext()) {
			String word = input.next().toLowerCase();
			words.add(word);
		}
		System.out.println(words);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).equals(kelime))
				System.out.println("Aranýlan kelimenin indeksi = " + i);
			else
				System.out.println("Aranýlan kelime bulunamdi...");

		}
		return kelime;
	}

}
