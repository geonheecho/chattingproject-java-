package _04_for;

import java.util.Scanner;

public class _02_While {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
		//초기값, 조건식, 증감식

		int i = 1; //초기값
		while(i<=10) { // 조건식
			System.out.println(i);
			i++; //증감식
		}

		//while(true) {
		//		System.out.println("무한반복");
		//	}

		boolean isEnd = false;
		Scanner keyboard = new Scanner(System.in);
		int hp = 100;
		int attack = 5;

		while(!isEnd) {
			System.out.println("[몬스터의 현재 남은 체력 : "+hp+"]");
			System.out.println("[1]공격하기");
			System.out.println("[2]도망가기");
			System.out.print("선택>>>");
			int choice = keyboard.nextInt();
			if(choice==1) {
				System.out.println("공격했습니다");
				hp-=attack;
				if(hp==0) {
					System.out.println("축하합니다. 몬스터가 죽었습니다.");
					System.out.println("게임을 종료합니다");
					isEnd=true;
				}
			}else if(choice==2) {
				isEnd=true;
			}else {
				System.out.println("1번 혹은 2번을 선택해주세요");
			}
			System.out.println("---------------------------------");
		}//while
		keyboard.close();

	} //main
}//class
