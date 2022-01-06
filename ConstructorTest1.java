package test.consructor1;

public class ConstructorTest1 {
	private int n;
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}

	public ConstructorTest1(int n) {
		this.n = n;
		System.out.println("constructorTest("+n+") 호출");
	}
}
