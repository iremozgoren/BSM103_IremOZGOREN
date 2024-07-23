package _20010310052_Irem_Ozgoren;

import java.util.*;
import java.io.*;
public class _20010310052_Main {
    public static void main(String[] args) {
        _20010310052_RAM bellekYonetimi = new _20010310052_RAM();
        try {
            bellekYonetimi.prosesleriYukle("girdi.txt");
            bellekYonetimi.simulasyonuCalistir();

            Scanner scan = new Scanner(System.in);

            System.out.println("girdi.txt dosyasi okundu.");
            System.out.println("Lutfen RAM'in durumunu gormek istediginiz saniyeyi giriniz.");
            int saniye = scan.nextInt();
            if (saniye >= 0 && saniye <= 2147483645) {
                bellekYonetimi.bellekDurumunuGoster(saniye);

                System.out.println(saniye + ". saniyedeki PCB'sini goruntulemek istediginiz proses ismini giriniz:");
                scan.nextLine();
                String processName = scan.nextLine();
                bellekYonetimi.prosesPCBGoster(processName, saniye);
            } else {
                System.out.println("Gecersiz saniye degeri. Lutfen 0 ile 2147483645 arasinda bir deger giriniz.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("girdi.txt dosyasi bulunamadi.");
        }
    }
}
