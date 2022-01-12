package test.abstract1;

public class Fighter extends Weapon3 {

	@Override
	public void fire() {
		System.out.println("슈우웅 쾅쾅쾅");
	}
	
	public void fly() {
		System.out.println("전투기가 난다.");
	}

}
