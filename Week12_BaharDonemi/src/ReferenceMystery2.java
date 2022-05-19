
public class ReferenceMystery2 {

	public static void main(String[] args) {
		int hp = 10;
		Pokemon squirtle = new Pokemon(5);

		battle(squirtle, hp);
		System.out.println("Level" + squirtle.level + "," + hp + "hp");

		hp = hp + squirtle.level;

		battle(squirtle, hp);
		System.out.println("Level" + squirtle.level + "," + hp + "hp");

	}

	public static void battle(Pokemon poke, int hp) {
		poke.level++;
		hp -= 5;
		System.out.println("Level" + poke.level + "," + hp + "hp");

	}

}
