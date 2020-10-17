package _99_practice;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaCafe {
	public static void main(String[] args) {

		//refactoring : ALT + SHIFT + R
		int[][] drink = new int[3][];
		drink[0]= new int []{4500,10}; //아메리카노
		drink[1]= new int []{4500,10}; //카페라떼
		drink[2]= new int []{5000,10}; //에스프레소

		boolean isExit = false; //true면 프로그램 종료
			int total1 = 0; //아메리카노 총액
			int total2 = 0; //카페라때 총액
			int total3 = 0; //에스프레소 총액
//			int totalIncome = total1+total2+total3; //총매출액
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("======Java Coffee Shop======");
			System.out.println('"'+"자바커피숍에 오신 것을 환영합니다."+'"');
			System.out.println("\t[1] 메뉴\n\t[2] 관리자 권한\n\t[3] 나가기");

			System.out.print("입력 : ");
			int choice = sc.nextInt();
			System.out.println("========================");

			switch(choice) {
			case 1 :
				System.out.println("\t[1]아메리카노:"+drink[0][0]+"\n\t[2]카페라떼: "+drink[1][0]+"\n\t[3]에스프레소: "+drink[2][0]+"\n\t[4]나가기");
				System.out.print("입력 : ");
				int choice1 = sc.nextInt();
				System.out.println("========================");
				if(choice1==1) {
					if(drink[0][1] == 0) {
						System.out.println("아메리카노가 다 떨어졌습니다.");
						break;
					}
					System.out.println('"'+"몇개를 구매하시겠습니까?"+'"');
					System.out.print("입력 : ");
					int num1 = sc.nextInt();

					if(num1 > drink[0][1]) {
						System.out.println('"'+"현재 재고보다 더 많이 입력하셨습니다."+'"');
						System.out.printf('"'+"현재 남은 재고는 %d개 입니다."+'"'+"\n",drink[0][1]);
						break;
					}else {
						drink[0][1] -= num1; //아메리카노 재고
						total1 += drink[0][0]*num1; //아메리카노 총액 //아메리카노 총액
						System.out.printf('"'+"총 %d원 입니다."+'"'+"\n", total1);
					}
					break;

				}else if(choice1==2) {
					if(drink[1][1]==0) {
						System.out.println('"'+"카페라떼가 다 떨어졌습니다."+'"');
						break;
					}
					System.out.println('"'+"몇개를 구매하시겠습니까?"+'"');
					System.out.print("입력 : ");
					int num1 = sc.nextInt();
					if(num1 > drink[1][1]) {
						System.out.println('"'+"현재 재고보다 더 많이 입력하셨습니다."+'"');
						System.out.printf('"'+"현재 남은 재고는 %d개 입니다."+'"'+"\n",drink[1][1]);
					break;
				}else {
					drink[1][1] -= num1; //카페라떼 재고
					total2 += drink[1][0]*num1; // 카페라떼 총액
					System.out.printf('"'+"총 %d원 입니다."+'"'+"\n", total2);
					break;
				}
			}else if(choice1==3) {
				if(drink[2][1]==0) {
					System.out.println('"'+"에스프레소가 다 떨어졌습니다."+'"');
				break;
				}
				System.out.println('"'+"몇개를 구매하시겠습니까?"+'"');
				System.out.print("입력 : ");
				int num1 = sc.nextInt();
				if(num1 > drink[2][1]) {
					System.out.println('"'+"현재 재고보다 더 많이 입력하셨습니다."+'"');
					System.out.printf('"'+"현재 남은 재고는 %d개 입니다."+'"'+"\n",drink[2][1]);
					break;
				}else {
				drink[2][1] -= num1; //에스프레소 재고
				total3 += drink[2][0]*num1; //에스프레소 총액
				System.out.printf('"'+"총 %d원 입니다."+'"'+"\n", total3);
				break;
				}
			}else if(choice1==4) {
				isExit=true;
				break;
			}else{
				System.out.println('"'+"보기의 선택 중에 하나를 입력해주세요."+'"');
				break;
			}
		case 2 :
			System.out.printf('"'+"관리자 비밀번호를 입력해주세요."+'"');
			System.out.print("\n비밀번호 : ");
			int pw = sc.nextInt();
			if(pw==1234) {
				System.out.println('"'+"승인되었습니다."+'"');
				System.out.println("========================");
				System.out.println("\t\t▷매출액◁\n\t\t"+(total1+total2+total3)+"원");
				System.out.printf("\t▷현재 남은 재고◁\n\t아메리카노: %d 개\n\t카페라떼: %d 개\n\t에스프레소: %d 개\n", drink[0][1],drink[1][1],drink[2][1]);
			break;
			}else {
				System.out.println('"'+"잘못된 비밀번호입니다."+'"');
			}
			break;

		case 3 : 
			isExit=true;
			break;
		default :
			System.out.println("보기의 선택 중에 하나를 입력해주세요");
		}//switch

		if(isExit) {
			System.out.println("정말로 종료하시겠습니까?\n[1]네\n[2]아니오");
			System.out.print("입력 : ");
			if(sc.nextInt()==2) {
				isExit = false;
				System.out.println("프로그램 종료가 취소되었습니다.");
			}else {
				break;
			}
		}
	}//while
	System.out.println('"'+"방문해 주셔서 감사합니다."+'"');
	System.out.println(">>>>>>>시스템종료<<<<<<<");
	sc.close();
}//main
}//class
