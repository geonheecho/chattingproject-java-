package _97_exampleClass.view;

import _97_exampleClass.repository.DB;

public class ViewPages {
	
	private DB db;
	
	public ViewPages(DB database){
		db = database;
	}
	
	public void line() {
		System.out.println("==========================");
	}
	
	public void viewMain() {
		line();
		System.out.println("<<<Java Cafe에 오신 것을 환영합니다.>>>");
		System.out.println("1. 주문하기");
		System.out.println("2. 관리자 권한");
		System.out.println("3. 종료하기");
		System.out.println("<<입력>>");
	}
	
	public void viewMenu() {
		String[] coffees = db.readCoffees();
		int[] prices = db.readPrices();
		int endNum = 0;
		line();
		for(int i = 0; i < coffees.length; i++) {
			System.out.printf("%d. %s : %d\n",i+1, coffees[i], prices[i]);
			if(i == coffees.length-1) {
				endNum = coffees.length +1;
			}
		}
		System.out.println(endNum+". 취소");
		System.out.println("<<입력>>");
	}
	
	public void viewQueryCoffeeNum(int selectedCoffee) {
		String[] coffees = db.readCoffees();
		line();
		System.out.println(coffees[selectedCoffee-1]+ "를 선택하셨습니다.");
		System.out.println("몇 잔을 구입하시겠습니까? [0]을 입력하시면 취소됩니다.");
		System.out.println("<<입력>>");
	}

	public void viewAdminPage() {
		line();
		System.out.println("관리자 페이지에 들어오셨습니다.");
		System.out.println("비밀번호를 입력해주세요.");
		System.out.println("<<입력>>");
	}
	
	public void viewCoffeesAndStocksAndTotal() {
		line();
		String[] coffees = db.readCoffees();
		int[] prices = db.readPrices();
		int[] stocks = db.readStocks();
		int total = db.readTotal();
		for(int i = 0; i < coffees.length; i++) {
			System.out.println("커피 이름 : " + coffees[i]);
			System.out.println("커피 가격 : " + prices[i]);
			System.out.println("커피 수량 : " + stocks[i] );
			System.out.println("-------------------------");
		}
		System.out.println("총 매출 : " + total);
	}

	public void viewWrongInput(String message) {
		line();
		System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
		if(!(message == null || message.equals(""))) {
			System.out.println(message);
		}
	}
	
	public void viewAskTerminate() {
		line();
		System.out.println("정말로 종료하시겠습니까?");
		System.out.println("1. 예\n2. 아니오");
		System.out.println("<<입력>>");
	}
	
	public void viewWhenTerminate() {
		line();
		line();
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("사용해 주셔서 감사합니다.");
		line();
		line();
	}
	
}
