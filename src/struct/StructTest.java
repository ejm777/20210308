package struct;

public class StructTest {

	// 아래 메서드를 완성시켜주세요.
	// StructEx 타입 자료를 입력받아 4개의 변수를 
	// 전부 콘솔창에 찍어줍니다.
	public static void getWarriorStatus(StructEx ac) {
		System.out.println("전사 아이디 조회중...");
		System.out.println("아이디:" + ac.id);
		System.out.println("레벨:" + ac.level);
		System.out.println("체력:" + ac.hp);
		System.out.println("공격력:" + ac.atk);
	}//getStatus
	
	public static void getMagitionStatus(Magition m) {
		System.out.println("마법사 아이디 조회중...");
		System.out.println("아이디:" + m.id);
		System.out.println("레벨:" + m.level);
		System.out.println("마나:" + m.mana);
		System.out.println("방어력:" + m.def);
	}//getMagitionStatus
	
	//전사에게 몬스터 사냥기능 추가
	public static void huntMonster(StructEx ac) {
		System.out.println("전사가 몬스터를 잡습니다.");
		ac.hp -= 3;
		ac.level += 1;
	}//huntMonster
	
	public static void main(String[] args) {
		
		StructEx w1 = new StructEx();
		w1.atk = 3;
		w1.hp = 20;
		w1.level = 1;
		w1.id = "전사1";
		getWarriorStatus(w1);
		huntMonster(w1);
		getWarriorStatus(w1);
		huntMonster(w1);
		
		// 전사를 하나 더 만들어서 조회해보세요.
		System.out.println("==========");
		
		Magition m= new Magition();
		m.def = 5;
		m.mana = 10;
		m.level = 2;
		m.id = "마법사";

		getMagitionStatus(m);
		
		
	}//main

}//class
