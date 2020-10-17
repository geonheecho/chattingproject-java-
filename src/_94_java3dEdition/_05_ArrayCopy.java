package _94_java3dEdition;

import java.util.Arrays;

public class _05_ArrayCopy {
	public static void arrayEx1() {
		//p195
		String[] abc = {"A", "B", "C", "D"};
		String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(num));

		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		String[] result = new String[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(Arrays.toString(result));

		//배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(Arrays.toString(num));

		//number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(Arrays.toString(num));
	}

	public static void arrayEx2() {
		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
		};

		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("======================");

		for(int i = 0; i < score.length; i++) {
			int sum = 0;		//개인별 총점
			float avg = 0.0f;		//개인별 평균

			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum/(float)score[i].length;	//평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("======================");
		System.out.printf("총점: %3d %4d %5d%n", korTotal, engTotal, mathTotal);
	}

	public static void main(String[] args) {
		arrayEx1();
		arrayEx2();
	}
}
