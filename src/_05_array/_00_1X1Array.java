package _05_array;

import java.util.Arrays;

public class _00_1X1Array {
	public static void main(String[] args) {
		//배열 = index+value
		int[] iArr= new int[5];
		iArr[0]=5;
		iArr[1]=10;
		iArr[2]=15;
		iArr[3]=20;
		iArr[4]=25;
		//iArrr[5]=30; //Error: index 범위 초과 에러
		System.out.println(iArr[2]);

		//또 다른 방식의 배열 선언법 1
		int[] iArr2= new int[]{5,10,15,20,25};

		//또 다른 방식의 배열 선언법 2
		int[] iArr3 = {5,10,15,20,25};

		//배열 출력하는 방법1 : for문을 이용
		for(int i = 0; i< iArr.length; i++) {
			System.out.println((i+1)+"번째 배열 값 : "+ iArr[i]);
		}
		
		System.out.println(iArr); //주소값 출력
		//배열 출력하는 방법2 : Arrays클래스를 이용
		String str = Arrays.toString(iArr);
		System.out.println(str);

		//[5,10,15,20,25]: for문을 이용해서 출력

		System.out.print("[");
		for(int i = 0; i< iArr.length; i++) {
			System.out.print(iArr[i]);
			if(i<4) {
				System.out.print(", ");
			}
		}System.out.println("]");
		
		//배열의 default값
		// 정수(0), 실수(0.0), 불린(false), 참조형(null),
	}//main
}//class
