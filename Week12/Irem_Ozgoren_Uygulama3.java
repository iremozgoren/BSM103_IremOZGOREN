import java.util.Scanner;

public class Irem_Ozgoren_Uygulama3 {
	public class uygulama_3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Bir kelime giriniz: ");
			String kelime = sc.nextLine();
			System.out.println("Girilen kelime = "+kelime);
			
			System.out.println("Kelimenin tersten girilmiş hali ="+tersten(kelime));
		

		}
		public static String tersten(String kelime) {
			String ters = "";
			for(int index = kelime.length(); index > 0; index--) {
				ters += kelime.substring(index-1, index);
			}
			return ters;
		}

	}


}
