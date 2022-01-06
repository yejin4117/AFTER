package test.overload1;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MethodOverloadTest ot = new MethodOverloadTest();
		
		System.out.println("===== 덧 셈   =====");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.printf("%d + %d = %d\n",n1,n2,ot.calc(n1,n2));
		
		System.out.println("===== 곱 셈   =====");
		double n3=scan.nextDouble();
		double n4=scan.nextDouble();
		System.out.printf("%.1f * %1f = %.3f\n",n3,n4,ot.calc(n3, n4));

	}

}
