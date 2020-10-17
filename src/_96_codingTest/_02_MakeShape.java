package _96_codingTest;

import _96_codingTest.InputNumber;
import static java.lang.Math.sqrt;

public class _02_MakeShape {
	public static void main(String[] args) {
		InputNumber Input = InputNumber.createInputDataFunction();
		int n = Input.selectNum();
		System.out.println("숫자 확인완료");
		System.out.println("선택한 숫자 : "+n);
	
		//동그라미
		System.out.println("============\n동그라미 모양 ↓ \n============");
		for(int i = 0; i <= n*2; i++) {
			for(int j =0; j<=n*2; j++) {
				//원의 중심좌표(n,n)로부터 (i,j)사이의 거리를 구함
				int d = (int) sqrt((i - n) * (i - n) + (j - n) * (j - n));
				//(i, j)좌표가 (n,n)사이의 거리가 반지름의 길이 이하일때 좌표를 찍음
				if(d<=n) {
					System.out.print("*   ");
				}else
					System.out.print("     ");
			}
			System.out.println();
		}
	}
}
