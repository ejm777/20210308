package object;

public class Magition {
	//마법사가 사용할 스탯을 적어주세요.
		public int level;
		public int mp;
		public int gold;
		public int def;
		public int heal;
		public String id;
		// 생성자 정의
		public Magition(String userId) {
			System.out.println("전사 아이디 생성중입니다...");
			id = userId;
			mp = 20;
			level = 1;
			def = 3;
			gold = 200;
		}
		public void meditation() {
			mp = 20;
		}
		public void getStatus() {
			System.out.println("아이디:" + id);
			System.out.println("마력:" + mp);
			System.out.println("레벨:" + level);
			System.out.println("방어력:" + def);
			System.out.println("소지골드:" + gold);
		}//getStatus
		
		// 구조체 로직과 비슷하게 사냥하기 기능을 추가해 주세요.
		
		public void huntMonster() {
			System.out.println("사냥을 시작합니다.");
			mp = 3;
			level += 1;
			System.out.println("휴식을 취합니다.");
		}
		
}//class
