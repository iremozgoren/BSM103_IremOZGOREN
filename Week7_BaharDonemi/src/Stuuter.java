import java.util.LinkedList;
import java.util.Queue;

public class Stuuter {

	public static void main(String[] args) {
		int data [] = {3,4,8,9,1};
		Queue<Integer>q = new LinkedList<Integer>();
		
		for(int n: data)
			q.add(n);
		System.out.println(q);
		stutter(q);
		System.out.println(q);
		

	}
	public static void stutter(Queue<Integer>q) {
		int size = q.size();
		
		while(size > 0) {
			int temp = q.remove();
			q.add(temp);
			q.add(temp);
			size--;
		}
	}

}
