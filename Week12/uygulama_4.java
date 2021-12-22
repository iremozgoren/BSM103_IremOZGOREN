package calýsma;

import java.util.Scanner;

public class uygulama_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String inputStr = sc.nextLine();
		System.out.println("Bir sayý giriniz: ");
		int inputInt = sc.nextInt();
		
		splitter(inputStr, inputInt);
			
	}
	public static void splitter(String str,int n){
		int index = 0;
		for(int i = 0; i <str.length()/n; i++) {
			System.out.println(str.substring(index, index+n));
			index = index +n;
		}
		System.out.println(str.substring(index,str.length()));

}
	

}
