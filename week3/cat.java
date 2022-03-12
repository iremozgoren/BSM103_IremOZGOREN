package week3;

public class cat {
	int age;
	String name;
	String color;
	
	public cat() {
		this.age = 1;
		this.color = "renk girilmedi";
		this.name = "isim girilmedi";
				
	}
	public cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		
	}
	public cat(int age, String name, String color) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

}
