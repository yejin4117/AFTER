package test.overriding1;

public class Bomb extends Weapon {
	@Override
	public void fire() {
		System.out.println("½");
	}

}
