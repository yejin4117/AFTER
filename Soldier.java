package test.abstract1;

public class Soldier extends Weapon3 {

	//부모 클래스가 추상 클래스인 경우 부모 클래스의 추상 메소드를 반드시 구현해야만 한다.
		@Override
		public void fire() {
			System.out.println("탕탕탕탕 탕탕탕탕 탕탕탕탕 탕탕 탕탕 탕탕탕탕 타다탕탕탕 탕탕탕탕 탕탕탕탕");
		}

		public void walk() {
			System.out.println("군인이 걷는다.");
		}

}
