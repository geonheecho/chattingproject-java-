package _96_codingTest;

import java.util.Scanner;

public class InputNumber {
	private Scanner keyboard;

	private static boolean isCreatedOnce = false;
	private static InputNumber InputNumber = null;

	//singleton 패턴 [디자인 패턴]
	public static InputNumber createInputDataFunction() {
		if(!isCreatedOnce) {
			InputNumber = new InputNumber();
			InputNumber.keyboard = new Scanner(System.in);
			isCreatedOnce = true;
			return InputNumber;
		}else {
			System.out.println("이미 InputData객체가 생성되었습니다.");
			return InputNumber;
		}
	}

	private InputNumber() {}

	public int selectNum() {
		int n;
		while(true) {
			System.out.println("숫자를 입력해주세요(홀수, 양수)");
			n = keyboard.nextInt();
			if(n%2 == 0||n<=0) {
				System.out.println("홀수만 입력해주세요(양수를 입력해주세요)");
				continue;
			}else
				break;
		}
		return n;
	}

	public void destory() {
		keyboard.close();
}
}
