import java.util.*;

public class ParentsisMatching {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kontrol etmek istediginiz ifadeyi giriniz: ");
		String exp = input.next();

		if (isMatching(exp))
			System.out.println("Dengelidir");
		else
			System.out.println("Dengeli degildir");

	}

	public static boolean isMatching(String exp) {
		Stack<Character> s = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(')
				s.push(exp.charAt(i));

			else if (exp.charAt(i) == ')')
				if (!s.isEmpty())
					s.pop();
				else
					return false;
		}
		return (s.isEmpty());

	}

}
