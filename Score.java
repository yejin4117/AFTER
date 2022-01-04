import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] stuNames= {"학생1 ","학생2 ","학생3 ","학생4 ","학생5 "};
		
		System.out.print("학생 수를 입력해주세요 : ");
		//학생 수
		int stuNum = s.nextInt();
		
		int[][] scores = new int [stuNum][];
		int[] sum = new int[stuNames.length];
		//동적배열의 행()
		for (int i = 0; i < scores.length; i++) {
			System.out.print(stuNames[i] + "학생의 과목 수를 입력해주세요 : ");
			int subNum = s.nextInt();
			scores[i] = new int[subNum];
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(j+1+"점수 : ");
				scores[i][j]= s.nextInt();
				sum[i] += scores[i][j];
			}//j
		}//i
		
		for(int i =0; i<scores.length; i++) {
			System.out.println();
			System.out.print(stuNames[i] +" : \t");
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}//j
		
		double average = (double)sum[i] / scores[i].length;
		
		System.out.print("합계 : " + sum[i] +"\t");
		System.out.print("  평균 : " + average);

		}//i
		s.close();
	}//main
}
