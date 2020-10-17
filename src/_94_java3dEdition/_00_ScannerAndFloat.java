package _94_java3dEdition;

import java.util.Scanner;

public class _00_ScannerAndFloat {
	public static void FloatEx() {
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;

		System.out.printf("	123456789012345678901234%n");
		System.out.printf("f : %f%n", f);		//소수점 이하 6째자리까지 출력.
		System.out.printf("f : %24.20f%n", f);	
		System.out.printf("f2 : %24.20f%n", f2);	
		System.out.printf("d : %24.20f%n", d);	
		
	}

	public static void ScannerEx() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("두자리 정수를 하나 입력해주세여. >");
		String input = scanner.nextLine();
		int num	= Integer.parseInt(input);		//입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 : "+input);
		System.out.printf("num=%d%n", num);

		//만일 숫자가 아닌 문자 또는 기호를 입력하면, 입력받은 문자열을 숫자로 변환하는 과정인 Integer.parseInt()에서
		//에러가 발생한다. 특히 공백을 입력하지 않도록 주의하다.
	}

	public static void main(String[] args) {
		FloatEx();
		ScannerEx();
//		Integer.toBinaryString
	}
}
