package _94_java3dEdition;

import java.util.Scanner;

public class _02_SwitchCase {
	//	p150
	public static void main(String[] args) {
		System.out.print("<가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>\n [입력] :");

		Scanner keyboard = new Scanner(System.in);
		int user = keyboard.nextInt();	//화면을 통해 입력받은 수자를 user에 저장
		int com = (int)(Math.random()*3)+1; //1, 2, 3 중 하나가 com에 저장됨
		String userChoice = null;
		String comChoice = null;

		if(user == 1) {
			userChoice = "가위";	
		}else if(user == 2) {
			userChoice = "바위";
		}else
			userChoice = "보";
		if(com == 1) {
			comChoice = "가위";	
		}else if(com == 2) {
			comChoice = "바위";
		}else
			comChoice = "보";		

		System.out.println("당신은 "+ userChoice +"입니다." );
		System.out.println("컴은 "+ comChoice +"입니다." );

		switch(user - com) {
		case 1 : case -2 :
			System.out.println("당신이 이겼습니다!!!");
			break;
		case 2 : case -1 :
			System.out.println("당신이 졌습니다!!!");
			break;
		default :
			System.out.println("비겼습니다!!!");
			//			break;	//마지막 문장이므로 break를 사용할 필요가 없다.
		}
	}
}
