package _02_operation;

import java.util.Scanner;

public class _01_Arithmetic {
	public static void main(String[] args) {
		//산술 연산자: + - * / %
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1=sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2=sc.nextInt();
		System.out.println("덧셈 결과 : "+(num1+num2));
		System.out.println("뺄셈 결과 : "+(num1-num2));
		System.out.println("곱셈 결과 : "+(num1*num2));
		System.out.println("나눗셈 결과(몫) : "+(num1/num2));
		System.out.println("나눗셈 결과(나머지) : "+(num1%num2));
		
		
		sc.close();
	}
}
