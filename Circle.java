package test.this1;

public class Circle {
	private int r;
	private double circum, area;
	
	public double getCircum() {
		return circum;
	}

	public double getArea() {
		return area;
	}
	
	public int getR() {
		return r;
	}

	public Circle(int r) {
		this.r = r;
	}

	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	
	public void calcArea() {
		area = Math.pow(r, 2) * Math.PI;
	}
	
	public void showInfo() {
		calcCircum();
		calcArea();
		RunCircle.showPrint(this);
	}

}
