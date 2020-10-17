package _98_classPractice.view;

import _98_classPractice.repository.Repository;

public class ViewPages {
	private Repository db;

	public ViewPages(Repository database) {
		db = database;
	}

	public void line() {
		System.out.println("========================");
	}

	public void viewMain() {
		System.out.println("<<<Java Cafe에 오신 것을 환영합니다.>>>");
		System.out.println("1. 주문");
		System.out.println("2. 관리자 페이지");
		System.out.println("3. 종료");
		System.out.println("<<입력>>");
	}

	public void viewMenu() {
		String[] coffees = db.readCoffees();
		int[] prices = db.readPrices();
		int endNum = 0; //
		line();
		System.out.println("구매하실 커피를 선택해주세요.");
		for(int i = 0; i < coffees.length; i++) {
			System.out.printf("%d. %s : %d원\n", i+1, coffees[i], prices[i]);
			if(i == coffees.length -1) {
				endNum = coffees.length +1;
			}
		}
		System.out.println(endNum+". 취소");
		System.out.println("<<입력>>");
	}
	
	public void viewMenuFromAdmin() {
		String[] coffees = db.readCoffees();
		int[] prices = db.readPrices();
		int endNum = 0; //
		line();
		System.out.println("공급하실 커피를 선택해주세요.");
		for(int i = 0; i < coffees.length; i++) {
			System.out.printf("%d. %s : 개당 %d원\n", i+1, coffees[i], prices[i]);
			if(i == coffees.length -1) {
				endNum = coffees.length +1;
			}
		}
		System.out.println(endNum+". 취소");
		System.out.println("<<입력>>");
	}
	
	public void viewQueryCoffeeNum(int selectedCoffee) {
		String[] coffees =db.readCoffees();
		int[] stocks = db.readStocks();
		line();
		System.out.println(coffees[selectedCoffee-1]+"를 선택하셨습니다.");
		System.out.printf("현재 %s는 %d개 남아있습니다.\n", coffees[selectedCoffee-1], stocks[selectedCoffee-1]);
		System.out.println("몇 잔을 구입하시겠습니까? [0]을 입력하시면 취소됩니다.");
		System.out.println("<<입력>>");
	}
		
	public void viewAdminPwPage() {
		line();
		System.out.println("관리자 페이지에 들어오셨습니다.");
		System.out.println("비밀번호를 입력해주세요.");
		System.out.println("<<입력>>");
	}
	
	public void viewAdminChoicePage() {
		line();
		System.out.println("1. 재고&총 매출액");
		System.out.println("2. 재고 공급");
		System.out.println("3. 비밀번호 변경");
		System.out.println("4. 나가기");
		System.out.println("<<입력>>");
	}
	
	public void viewCoffeesAndStocksAndTotal() {
		String[] coffees = db.readCoffees();
		int[] stocks = db.readStocks();
		int total = db.readTotal();
		line();
		for(int i = 0; i<coffees.length; i++) {
			System.out.printf("%s : %d 잔\n", coffees[i], stocks[i]);
			System.out.println("--------------------------");
		}
		System.out.println("총 매출액 : "+total);
	}
	
	public void viewOldPwPage() {
		line();
		System.out.println("현재 비밀번호를 입력해주세요. [0]을 입력하면 취소됩니다.");
	}
	
	public void viewNewPwPage() {
		line();
		System.out.println("변경할 비밀번호를 입력해주세요. [0]을 입력시 취소됩니다.");
		System.out.println("변경할 비밀번호는 반드시 4자리 숫자만을 입력해야합니다.");
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
