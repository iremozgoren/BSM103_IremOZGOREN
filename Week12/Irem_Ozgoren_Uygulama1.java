
import java.util.*;
public class Irem_Ozgoren_Uygulama1 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Ka� tane ��rencinin notu girilecek? ");
			int ogrenciSayisi = input.nextInt();
			System.out.println(ogrenciSayisi+ " tane ��rencinin notu girilecektir. ");
			double[]ortalama = new double[ogrenciSayisi];
			for(int sayac = 1; sayac <= ogrenciSayisi; sayac++) {
				System.out.println(sayac+ " . ��rencinin vize notunu giriniz: ");
				int vizeNotu = input.nextInt();
				System.out.println(sayac+ " . ��rencinin final notunu giriniz: ");
				int finalNotu = input.nextInt();
				ortalama[sayac - 1] = ortalama(vizeNotu, finalNotu);
				
				
				System.out.println("��rencinin vize notu = "+vizeNotuHesaplama(vizeNotu));
				System.out.println("��rencinin final notu = "+finalNotuHesaplama(finalNotu));
			}
			System.out.println("T�m ��rencilerin ge�me notu");
			System.out.println(Arrays.toString(ortalama)); 

		}
		public static double vizeNotuHesaplama(int vizeNotu) {
			double not = 0.0;
			if(vizeNotu >= 80 && vizeNotu != 100) {
				not = vizeNotu*1.10;
			}
			else if(vizeNotu >= 60 && vizeNotu != 100) {
				not = vizeNotu*1.05;
			}
			else
				not = vizeNotu;
			if(vizeNotu > 100)
				not = 100; 
			
				return not;
		}
		public static double finalNotuHesaplama(int finalNotu) {
			double not = 0.0;
			if(finalNotu >= 70 && finalNotu != 100) {
				not = finalNotu*1.10;
			}
			else if(finalNotu >= 40 && finalNotu != 100) {
				not = finalNotu*1.05;
			}
			else 
				not = finalNotu;
			if(finalNotu > 100)
				not = 100;
			
			return not;
		}
		public static double ortalama(int vizeNotu, int finalNotu) {
			vizeNotu = (int) vizeNotuHesaplama(vizeNotu);
			finalNotu = (int) finalNotuHesaplama(finalNotu);
			double ortalama = vizeNotu*0.4 + finalNotu*0.6;
			return ortalama;

	}

}
