package test.abstract1;

public class Tank extends Weapon3 {

	@Override
	public void fire() {
		System.out.println("슈우웅~ 쾅쾅!");
	}
	
	public void forward() {
		System.out.println("탱크가 전진한다.");

	}

}
