package _98_classPractice.controller;

import _98_classPractice.repository.Repository;
import _98_classPractice.service.AdminService;
import _98_classPractice.view.ViewPages;

public class AdminController {

	private Repository db;
	private ViewPages front;
	private AdminService adminService;
	private int start;
	private int end;

	public AdminController(Repository database) {
		db = database;
		front = new ViewPages(db);
		adminService = new AdminService(db);
		start=1;
		end= db.readCoffees().length;
	}

	public void showAdminPwPage() {
		front.viewAdminPwPage();
	}

	public void showAdminChoicePage() {
		front.viewAdminChoicePage();
	}

	public void showMenuFromAdmin() {
		front.viewMenuFromAdmin();
	}

	public void showOldPassword() {
		front.viewOldPwPage();
	}

	public void showNewPassword() {
		front.viewNewPwPage();
	}

	public void showAllInfor() {
		front.viewCoffeesAndStocksAndTotal();
	}
	
	public boolean authCheck(int inputPassword) {
		if(adminService.checkPassword(inputPassword)) {
			System.out.println("관리자 페이지에 들어오셨습니다.");
			return true;
		}else {
			front.viewWrongInput("비밀번호를 잘못입력하셨습니다.");
			return false;
		}
	}

	public int showSupplyCoffees(int selectedCoffee) {
		if(adminService.isDataInRange(selectedCoffee, start, end)) {  //커피 메뉴 선택지 안에 있음->개수 선택화면
			front.viewQueryCoffeeNum(selectedCoffee);
			return 1;
		}else if(selectedCoffee == end+1){	//취소 ->메인화면
			return 2;
		}else { 	//메뉴 선택을 잘못함
			return 0;
		}
	}

	public int supplying(int selectedCoffee, int num) {
		if(num == 0) {		//취소 ->메인화면으로
			return 2;
		}else if(db.readTotal()>0) {
			if(adminService.increaseStocks(selectedCoffee, num)) {
			System.out.println("1111");
				return 2;		//주문성공 ->메인화면
			}else {
				front.viewWrongInput("잔액이 부족합니다.");
			return 1;
			}
		}else{ 					//주문실패 -> 개수 선택화면
			front.viewWrongInput("잔액이 부족합니다.");
			return 1;
		}
	}	

	public int checkPw(int inputPassword) {
		if(adminService.checkPassword(inputPassword)) {
			return 1;
		}else if(inputPassword ==0) {
			return 2;
		}else {
			front.viewWrongInput("잘못된 비밀번호를 입력하셨습니다.");
			return 0;
		}
	}

	public int changPw(int inputPassword){
		if(inputPassword == 0) {		//취소 ->메인화면으로
			return 2;
		}else if(adminService.isNewPwInRange(inputPassword)) {
			adminService.changePassword(inputPassword);
			return 2;  			//변경성공 ->메인화면
		}else { 					//변경실패 -> 변경화면
			front.viewWrongInput("조건에 맞는 비밀번호를 입력해주세요.");
			return 1;
		}
	}
}