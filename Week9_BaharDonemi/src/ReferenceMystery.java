
public class ReferenceMystery {

	public static void main(String[] args) {
		String name = "janet";
		int money = 30;
		Account a = new Account(name,money);
		mystery(name,money,a);
		System.out.println(name+","+money+","+a);
		
		money = money+10;
		a.name ="Bily";
		mystery(name,money,a);
		System.out.println(name+","+money+","+a);
	}
	public static void mystery(String name,int money,Account a) {
		a.money++;
		name = "Susan";
		System.out.println(name+","+money+","+a);
	}

}
