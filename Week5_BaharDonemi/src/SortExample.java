import java.util.*;

public class SortExample {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("kitap");
		
		System.out.println("Sýralamadan önce: "+words);
		System.out.println(words.get(0)); 
		
		Collections.sort(words);
		System.out.println("Sýralamadan sonra: "+words);

	}

}
