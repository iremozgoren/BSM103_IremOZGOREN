import java.util.ArrayList;

public class StarAdd {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("kitap");
		System.out.println("Döngüden önce: " + words);
		System.out.println("Listenin uzunluðu: " + words.size());

		for (int index = 0; index < words.size(); index += 2) {
			words.add(index, "*");
		}
		System.out.println("Döngüden sonra: " + words);
		System.out.println("Listenin uzunluðu: " + words.size());

		for (int index = 0; index < words.size(); index++) {
			words.remove(index);
		}
		System.out.println("Silme sonrasý: " + words);
		System.out.println("Silme sonrasý listenin uzunluðu: " + words.size());

	}

}
