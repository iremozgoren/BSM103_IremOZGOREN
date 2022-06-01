
public class main {

	public static void main(String[] args) {
		LinkedIntList linkList = new LinkedIntList();
		linkList.add(5);
		linkList.add(7);
		linkList.add(9);
		System.out.println(linkList.toString());
		linkList.remove(2);
		System.out.println(linkList.toString());
		linkList.add(0, 11);
		System.out.println(linkList.toString());
		linkList.add(2, 15);
		System.out.println(linkList.toString());
		
		int count = linkList.size();
		System.out.println(count);
		

	}

}
