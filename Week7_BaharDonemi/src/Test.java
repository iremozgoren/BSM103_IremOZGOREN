import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {

		int data[] = { 18, 4, 3, 9, 4, 2 };
		Queue<Integer> q = new LinkedList<Integer>();
		for (int n : data)
			q.add(n);

		System.out.println("queue = " + q);
		removeAll(q, 4);
		System.out.println("queue = " + q);

	}

	public static void removeAll(Queue<Integer> q, int value) {
		int size = q.size();
		for (int i = 0; i < size; i++) {
			int n = q.remove();
			System.out.println(n + "elemaný çýkarýldý");
			System.out.println("Current queue = " + q);

			if (n != value) {
				q.add(n);
				System.out.println(n + " elemaný eklendi");
			}
		}

	}

}
