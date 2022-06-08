import java.util.*;
import java.util.function.*;

public class MathTutor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		giveProblems(console,3,"*",(x,y)->x*y);

	}

	public static void giveProblems(Scanner console, int numProblems, String text, IntBinaryOperator operator) {
		Random r = new Random();
		int numRight = 0;
		for (int i = 0; i < numProblems; i++) {

			int x = r.nextInt(12) + 1;
			int y = r.nextInt(12) + 1;

			System.out.println(x + " " + text + " " + y + "=");
			int answer = operator.applyAsInt(x, y);
			int reponse = console.nextInt();

			if (reponse == answer) {
				System.out.println("Dogru");
				numRight++;
			} else
				System.out.println("Yanlis cevap: " + answer);
		}
		System.out.println(numProblems + "cevaplanan dogru sayisi: " + numRight);

	}

}
