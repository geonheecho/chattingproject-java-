package _98_classPractice.controller;

import _98_classPractice.repository.Repository;
import _98_classPractice.service.OrderService;
import _98_classPractice.view.ViewPages;

public class OrderController {

	private Repository db;
	private ViewPages front;
	private OrderService orderService;
	private int start;
	private int end;
	
	public OrderController(Repository database) {
		db = database;
		front = new ViewPages(db);
		orderService = new OrderService(db);
		start = 1;
		end = db.readCoffees().length;
	}
	
	public void showMenuPage() {
		front.viewMenu();
	}
	
	public int showCoffeeNumPage(int selectedCoffee) {
		if(orderService.isDataInRange(selectedCoffee, start, end)) {  //커피 메뉴 선택지 안에 있음->개수 선택화면
			front.viewQueryCoffeeNum(selectedCoffee);
			return 1;
		}else if(selectedCoffee == end+1){	//취소 ->메인화면
			return 2;
		}else { 	//메뉴 선택을 잘못함
			front.viewWrongInput("잘못선택하셨습니다.");
			return 0;
		}
	}
	
	public int ordering(int selectedCoffee, int num) {
		if(num == 0) {		//취소 ->메인화면으로
			return 2;
		}else if(orderService.isDataInRange(num, 0, db.readStocks()[selectedCoffee-1])) {
			orderService.selling(selectedCoffee, num, true);
			return 2;  			//주문성공 ->메인화면
		}else { 					//주문실패 -> 개수 선택화면
			front.viewWrongInput("개수 선택이 잘못되었습니다.");
			return 1;
		}
	}
}
