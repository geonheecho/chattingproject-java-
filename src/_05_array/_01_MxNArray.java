package _05_array;

import java.util.Arrays;

public class _01_MxNArray {
	public static void main(String[] args) {

		//먼저 배열의 크기를 선언한 경우
		//		int[][] iArr = new int [3][5];
		//		iArr[1]= {1,2,3,4,5};
		//		iArr[2]= {6, 7, 8};
		//		iArr[3]= {9,10,11,12};
		//		Error		
		//먼저 배열의 크기를 일정하게 선언한 경우
		int[][] iArr = new int [3][2];
		iArr[0][0]=1;
		iArr[0][1]=2;
		iArr[1][0]=3;
		iArr[1][1]=4;
		iArr[2][0]=5;
		iArr[2][1]=6;

		//유동적으로 배열의 크기를 정하고 싶은 경우
		int[][] iArr2 = new int[3][];//첫번째 크기는 생략할 수 없다.
		iArr2[0]=new int[] {10,20,30,40,50,60};
		iArr2[1]=new int[] {1,2,3,4};
		iArr2[2]=new int[] {100,200};
		//iArr2[2]={100,200}; // Error

		//한번에 선언하는 방법
		int[][] iArr3= {
				{10,20,30,40,50,60},
				{1,2,3,4},
				{100,200}
		};

		//iArr3의 3을 출력해보기
		System.out.println(iArr3[1][2]);

		//배열 출력하는 방법1 : for문을 이용
		for(int i = 0; i < iArr3.length; i++) {
			for(int j = 0; j < iArr3[i].length; j++) {
				System.out.println(iArr3[i][j]);
			}
		}
		System.out.println(iArr3);
		System.out.println("===================");
		//배열 출력하는 방법2 : Arrays클래스를 이용
		System.out.println(Arrays.deepToString(iArr3));
		/*
		 * 그냥 1차원 배열을 Arrays쿨래스를 이용해 출력하면 toString()으로 충분
		 * 그러나 다차원 배열을 출력하고 싶으면 deepToString()을 써야한다.
		 */
	
	}
}
