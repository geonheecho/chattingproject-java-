package _94_java3dEdition;

import java.util.Scanner;

public class _04_BreakContinue {
	public static void mainMenu() {
		System.out.println("[1] square");
		System.out.println("[2] square root");
		System.out.println("[3] log");
		System.out.println("<< 원하는 메뉴(1~3)를 선택하세요. (종료는 [0]) >>");
	}

	public static void main(String[] args) {
		//p176
		int menu = 0;
		int num = 0;

		Scanner keyboard = new Scanner(System.in);

		while(true) {
			mainMenu();
			String tmp = keyboard.nextLine();		//화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 변환

			if(menu == 0) {
				System.out.println('"'+"프로그램을 종료합니다"+'"');
				break;	//while문 파괴
			}else if(!(1<=menu && menu <= 3)) {
				System.out.println('"'+"메뉴를 잘못 선택하셨습니다.(종료는 [0])"+'"');
				continue;
			}
			System.out.println('"'+"선택하신 메뉴는 "+menu+"번입니다."+'"');
		}

		// 이름 붙은 반복문(178p)

		// for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j==5) 
					break Loop1;	//Loop1 파괴
//										break;	//inner for문 파괴
//										continue Loop1;		//이와 같은 문장을 쓸 일은 거의 없으니 무시해도 좋음
//										continue;
				System.out.println(i+"*"+j+" = "+(i*j));
			}	// end of for i
			System.out.println();
		}//end of Loop1
	
	}//main
}//class
