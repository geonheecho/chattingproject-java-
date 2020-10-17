package _03_if;

import java.util.Scanner;

public class _01_ElseIf {
	public static void main(String[] args) {
		/*성적 입력(Scanner)
		 * 90점 초과 100점 이라 = 수
		 * 80초과 90이하 = 우
		 * 70초과 80이하 = 미
		 * 60초과 70이하 = 양
		 * 60이하 = 가
		 */

		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력해라.");
		int score = sc.nextInt();
		System.out.print("결과다 : ");
		if(score>90 && score<=100) {
			System.out.println("수");
		} else if(score>80 && score<=90) {
			System.out.println("우");
		} else if(score>70 && score<=80) {
			System.out.println("미");
		} else if(score>60 && score<=70) {
			System.out.println("양");
		} else if(score>=0 && score<=60) {
			System.out.println("가");
		}	else {System.out.println("점수는 0에서 100까지만 입력 가능하단다.");}



		sc.close();

	}
}
