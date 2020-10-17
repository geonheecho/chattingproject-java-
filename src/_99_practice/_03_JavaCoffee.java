package _99_practice;

import java.util.Scanner;

public class _03_JavaCoffee {

	public static void line() {
		System.out.println("※※※※※※※※※※※※");
	}

	public  static int inputData(Scanner keyboard) {
		System.out.print("[입력] : ");
		return keyboard.nextInt();
	}

	////////////////View///////////////////
	public static void viewMain() {
		System.out.println("<<<<<<<<Java Coffee에 오신 것을 환영합니다>>>>>>>>");
		System.out.println("1. 주문하기");
		System.out.println("2. 관리자 페이지");
		System.out.println("3. 종료하기");
	}

	public static void viewMenu(int[] prices) {
		line();
		System.out.printf("1. 아메리카노 : %d원\n", prices[0]);
		System.out.printf("2. 카페 라떼 : %d원\n", prices[1]);
		System.out.printf("3. 에스프레소 : %d원\n", prices[2]);
		System.out.printf("4. 취소\n");
	}

	public static void viewQueryCoffeeNum(String[] coffees, int selectedCoffee) {
		line();
		System.out.println(coffees[selectedCoffee-1]+"를 선택하셨습니다");
		System.out.println("몇 잔을 구매하시겠습니까? [0]을 입력하시면 취소됩니다.");
	}

	public static void viewAdminPage() {
		line();
		System.out.println("관리자 권한이 필요합니다. 비밀번호를 입력해주세요");
	}

	public static void viewCoffeesAndStocksAndTotal(String[] coffees, int[] stocks, int total) {
		line();
		for(int i = 0; i<coffees.length; i++) {
			System.out.println(coffees[i] + " : "+ stocks[i]+ "개");
		}
		System.out.println("총 매출액 : " + total); // total = 총매출액
	}

	public static void viewWrongInput() {
		line();
		System.out.println("잘못입력하셨습니다. 다시 입력해주세요!");
	}

	public static void viewWhenTerminate() {
		line();
		line();
		System.out.println("프로그램 종료합니다.");
		System.out.println("이용해 주셔서 감사합니다.");
		line();
		line();
	}

	////////////////Handler////////////////
	public static int selling(String[] coffees, int[] prices, int num, int[] stocks, int selectedcoffee) {
		int i = selectedcoffee-1; //선택된 커피
		int income = 0; //판매 금액
		stocks[i] -= num;//판매된 개수 만큼 재고 감소
		income = prices[i]*num;//판매금액 = 가격 곱하기 개수 , num= 선택한 개수
		System.out.println(coffees[i]+"를 " + income + "원 만큼 파셨습니다."); // 알림
		System.out.printf("현재남은 재고는 %d개 있습니다.\n", stocks[i]); // 남은 재고 알림
		return income;
	}

	public static boolean checkAdminPw(int inputPw, int pw) {
		if(inputPw==pw) {
			return true; // 비밀번호 일치시
		}else {
			return false;	
		}//비밀번호 불일치시
	}

	public static boolean isDataInRange(int data, int start, int end) {
		if(data >= start && data <= end) {
			return true;
		}else {
			return false;
		}
	}

	///////////////Component//////////////
	public static int orderSystem(Scanner keyboard, int[] prices, String[] coffees, int[] stocks) {
		boolean isSelected = false;
		boolean isInputNum = false;
		int select = 0; //커피 선택시 쓰이는 변수
		int num = 0; // 개수 선택시 쓰이는 변수
		while(true) {
			if(!isSelected) {
				viewMenu(prices);
				select = inputData(keyboard); //커피선택
				if(isDataInRange(select, 1, 3)) {
					isSelected = true;
				}else if(select==4) {
					break;  //4번 입력시 while문 강제 파괴-> viewMain()
				}else {
					viewWrongInput();
					continue;
				}
			}
			if(!isInputNum) {
				viewQueryCoffeeNum(coffees, select);
				num = inputData(keyboard); // 개수 선택
				if(!isDataInRange(num, 0, stocks[select-1])) {
					viewWrongInput();
					continue;
				}else if(num==0){
					System.out.println("취소되었습니다.");
					break;	// 0을 입력시 while문 강제 파괴 -> viewMain()
				}else {
					isInputNum = true;
				}
			}
			return selling(coffees, prices, num, stocks, select); //정상 주문시 총 주문금액(income)을 return하여 총매출(total)에 추가한다.
		}//while
		return 0;
	}

	public static void adminSystem(Scanner keyboard, String[] coffees, int[] stocks, int total, int pw) {
		viewAdminPage();
		int inputPw = inputData(keyboard);
		if(checkAdminPw(inputPw, pw)) {
			viewCoffeesAndStocksAndTotal(coffees, stocks, total); //비밀번호(checkAdminPw) 일치시
		}else {
			viewWrongInput(); //비밀번호(checkAdminPw) 불일치시
		}
	}

	////////////Main Program//////////////
	public static void javaCoffee() {
		String[] coffees = {"아메리카노", "카페 라떼", "에스프레소"}; //커피종류
		int[] prices = {3500, 4000, 2500}; //커피가격
		int[] stocks = {10, 10, 10}; //커피재고
		int pw = 1234; //관리자 비밀번호
		int total = 0; // 총매출액
		Scanner keyboard = new Scanner(System.in);
		boolean isTerminated = false;
		
		while(!isTerminated) {
			viewMain();
			int choice = inputData(keyboard);
			
			switch(choice){
			case 1 : //1.주문하기
				total += orderSystem(keyboard, prices, coffees, stocks);
				break;
			case 2 : //2. 관리자 페이지
				adminSystem(keyboard, coffees, stocks, total, pw);
				break;
			case 3 : //3. 종료하기 , while문 강제 파괴
				isTerminated = true;
				break;
				default :
					viewWrongInput();
					break;
			}//switch
	}//while (메인프로그램 실행 구간)
		viewWhenTerminate();
		keyboard.close();
	}
	
	public static void main(String[] args) {
		javaCoffee();
}//main
}
