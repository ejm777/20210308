package polymorph;

public class GameMain {

	public static void main(String[] args) {
		// 전사를 생성해주세요.
		Warrior w1 = new Warrior(20, 3, 1);
		// 오크를 orc1, orc2 두 개 생성해주세요.
		Orc orc1 = new Orc();
		Orc orc2 = new Orc();

		Troll t1 = new Troll();
		Goblin g1 = new Goblin();

		
		Dragon dra1 = new Dragon();
		Dragon dra2 = new Dragon();

		// orc1에게 전사의 hunt 메서드를 적용하세요.
		w1.hunt(orc1);
		w1.hunt(orc1);
		// 전사, orc1, orc의 체력을 조회해주세요.
		w1.showHp();
		orc1.showHp();
		orc2.showHp();

		System.out.println("-----------------");

		// dra1에게 전사의 hunt 메서드를 적용하세요.
		w1.hunt(dra1);
		w1.hunt(dra1);
		// 전사, dra1, dragon의 체력을 조회해주세요.
		w1.showHp();
		dra1.showHp();
		dra2.showHp();
		t1.showHp();
		g1.showHp();

	}// main

}// class
