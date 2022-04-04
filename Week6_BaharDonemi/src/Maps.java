import java.util.*;
public class Maps {

	public static void main(String[] args) {
		Map <Integer, String> citys = new TreeMap<Integer, String>();
		
		citys.put(34, "Istanbul");
		citys.put(6, "Ankara");
		citys.put(35, "Izmir");
		citys.put(55, "Samsun");
		
		System.out.println(citys);
		System.out.println("Ýndeksler - Keys "+citys.keySet());
		System.out.println(citys.values());
		System.out.println(citys.get(35));
		
		Map<Integer, Set<String>> citys2 = new HashMap<Integer, Set<String>>();
		citys2.put(34, new TreeSet<String>());
		citys2.get(34).add("Istanbul");
		citys2.get(34).add("Besiktas");
		citys2.get(34).add("Eminonu");
		
		citys2.put(6, new TreeSet<String>());
		citys2.get(6).add("Ankara");
		citys2.get(6).add("Cankaya");
		
		System.out.println(citys2);
		
		
		

	}

}
