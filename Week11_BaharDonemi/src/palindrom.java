import java.util.*;

public class palindrom {

	public static void main(String[] args) {
		System.out.println("Kelime giriniz: ");
		Scanner scan = new Scanner(System.in);
		String kelime = scan.nextLine();
		
		Stack list = new Stack();
		int uzunluk = kelime.length();
		for(int i = 0; i < uzunluk; i++) {
			list.push(kelime.charAt(i));
		}
		String bosluk = "";
		while(!list.isEmpty()) {
			bosluk = bosluk + list.pop(); 
		}
		if(kelime.equals(bosluk)) {
			System.out.println("Palindromdur");
		}
		else {
			System.out.println("Palindrom deðildir");
		}

	}


}
