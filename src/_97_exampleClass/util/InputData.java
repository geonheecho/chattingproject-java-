package _97_exampleClass.util;

import java.util.Scanner;

public class InputData {
	private Scanner keyboard;
	
	private static boolean isCreatedOnce = false;
	private static InputData inputData = null;
	
	//singleton 패턴 [디자인 패턴]
	public static InputData createInputDataFunction() {
		if(!isCreatedOnce) {
			System.out.println("새로운 InputData객체를 만듭니다.");
			inputData = new InputData();
			inputData.keyboard = new Scanner(System.in);
			isCreatedOnce = true;
			return inputData;
		}else {
			System.out.println("이미 InputData객체가 생성되었습니다.");
			return inputData;
		}
	}
	
	private InputData(){}
	
	public int selectNum() {
		return keyboard.nextInt();
	}
	
	public void destroy() {
		keyboard.close();
	}
}
