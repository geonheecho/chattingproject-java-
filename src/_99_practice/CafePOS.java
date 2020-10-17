package _99_practice;

import java.util.Scanner;

public class CafePOS {

	public static void line() {
		System.out.println("■□■□■□■□■□■□■□■□■");
	}

	public static int inputData(Scanner keyboard) {
		System.out.print("[입력] : ");
		return keyboard.nextInt();
	}

	//////////////// VIEW ////////////////
	public static void viewMain() {
		line();
		System.out.println("<<<Java Cafe에 오신 것을 환영합니다>>>");
		System.out.println("1. 주문하기");
		System.out.println("2. 매출확인/재고확인");
		System.out.println("3. 종료");
	}

	public static void viewMenu(int[] prices) {
		line();
		System.out.println("<<<커피를 선택해 주세요>>>");
		System.out.println("1. 아메리카노 : " + prices[0]);
		System.out.println("2. 카페라떼 : " + prices[1]);
		System.out.println("3. 에스프레소 : " + prices[2]);
		System.out.println("4. 취소");
	}

	public static void viewQueryCoffeeNum(String[] coffees, int selectedCoffee) { 
		line();
		System.out.println(coffees[selectedCoffee-1] + "를 선택하셨습니다!!!");
		System.out.println("몇 잔을 구입하시겠습니까? [0을 입력하시면 취소됩니다]");
	}

	public static void viewAdminPage() {
		line();
		System.out.println("관리자 페이지에 들어오셨습니다.");
		System.out.println("비밀번호를 입력해주세요~");
	}

	public static void viewCoffeesAndStocksAndTotal(String[] coffees, int[] stocks, int total) {
		line();
		for(int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i] + " : " + stocks[i] + "개");
		}
		System.out.println("총 매출액 : " + total);
	}

	public static void viewInformWrongInput() {
		line();
		System.out.println("잘못입력하셨습니다. 다시 입력해주세요~!");
	}
	
	public static void viewWhenTerminate() {
		line();
		line();
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("이용해주셔서 감사합니다.");
		line();
		line();
	}
	
	//////////////// Handler  ////////////////
	public static int selling(String[] coffees, int[] prices, int num, int[] stocks, int selectedCoffee) {
		int i = selectedCoffee-1; //선택된 커피
		int income = 0; //판매금액
		income = prices[i] * num; //가격 * 갯수
		stocks[i] -= num; //판매된 갯수만큼 재고 감소
		System.out.println(coffees[i] + "를 " + income +"원 만큼 파셨습니다.");
		System.out.printf("해당 커피의 현재 남은 재고는 %d개 있습니다.\n", stocks[i]);
		return income;
	}

	public static boolean checkManagerPassword(int inputPw, int pw) {
		if(inputPw == pw) {
			return true; //비밀번호 일치시
		}else {
			return false; //비밀번호 불일치시
		}		
	}

	public static boolean isDataInRange(int data, int start, int end) {
		if(data >= start && data <=end) {
			return true;
		}else {
			return false;
		}
	}
	
	//////////////// Component  ////////////////
	public static int orderSystem(Scanner keyboard, String[] coffees, int[] stocks, int[] prices) {
		boolean isSelected = false;
		boolean isInputedNum = false;
		int select = 0; // 커피 선택시 쓰이는 변수
		int num = 0; //갯수 선택시 쓰이는 변수
		
		while(true) {
			if(!isSelected) {
				viewMenu(prices);
				select = inputData(keyboard); //커피선택
				if(!isDataInRange(select, 1,4)) {
					viewInformWrongInput();
					continue;
				}else if(select == 4) {
					break; //4번을 입력했을때 취소, while문 강제 파괴
				}else {
					isSelected = true;
				}
			}
			
			if(!isInputedNum) {
				viewQueryCoffeeNum(coffees, select);
				num = inputData(keyboard); //갯수선택
				if(!isDataInRange(num, 0, stocks[select-1])) {
					viewInformWrongInput();
					continue;
				}else if(num == 0) {
					break; //0일때 취소, while문 강제 파괴
				}else {
					isInputedNum = true;
				}
			}
			return selling(coffees, prices, num, stocks, select); //정상 주문시 총 주문가격(income)을 return하여 총매출(total)에 추가한다.
		}
		return 0; //주문 취소시
	}
	
	public static void managerSystem(Scanner keyboard, String[] coffees, int[] stocks, int pw, int total) {
		viewAdminPage();
		int inputPw = inputData(keyboard);
		if(checkManagerPassword(inputPw, pw)) {
			viewCoffeesAndStocksAndTotal(coffees, stocks, total); //checkManagerPassword() 성공시
		}else {
			viewInformWrongInput(); //checkManagerPassword() 실패시
		}
	}
	
	//////////////// Main Program  ////////////////
	public static void cafePOS() {
		String[] coffees = {"아메리카노", "카페라떼","에스프레소"}; //커피 메뉴
		Scanner keyboard = new Scanner(System.in); //입력
		int[] prices = {3500,4000,2500}; //가격
		int total = 0; //총매출
		int[] stocks = {10,10,10}; //커피재고
		int pw = 1234; //관리자 비밀번호
		boolean isTerminated = false;

		while(!isTerminated) {
			viewMain();
			int choice = inputData(keyboard);

			switch(choice) {
			case 1: //1. 주문하기
				total += orderSystem(keyboard, coffees, stocks, prices);
				break;
			case 2://2. 매출확인/재고확인
				managerSystem(keyboard, coffees, stocks, pw, total);
				break;
			case 3://3. 종료
				isTerminated = true;
				break;
			default:
				viewInformWrongInput();
				break;
			}
		}//while : 메인 프로그램 실행 구간
		viewWhenTerminate();
		keyboard.close();
	}
	
	public static void main(String[] args) {
		cafePOS();
	}//main()

}//class