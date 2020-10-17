package _97_exampleClass.controller;

import _97_exampleClass.repository.DB;
import _97_exampleClass.service.OrderService;
import _97_exampleClass.view.ViewPages;

public class OrderController {
	private DB db;
	private ViewPages front;
	private OrderService orderService;
	private int start;
	private int end;
	
	public OrderController(DB database) {
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
		if(orderService.isDataInRange(selectedCoffee, start, end)) { //커피 메뉴 선택지 안에 있음 --> 개수 선택 화면
			front.viewQueryCoffeeNum(selectedCoffee);
			return 1;
		}else if(selectedCoffee == end+1){ //취소 --> 메인화면
			return 2;
		}else { // 메뉴 선택을 잘못함
			front.viewWrongInput("커피 선택을 제대로 해주세요");
			return 0;
		}
	}
	
	public int ordering(int selectedCoffee, int num) {
		if(num == 0) { //취소 --> 메인화면으로
			return 2;
		}else if(orderService.isDataInRange(num,0,db.readStocks()[selectedCoffee-1])){//주문성공 --> 메인화면
			orderService.selling(selectedCoffee, num, true);
			return 2;
		}else {//주문실패 --> 개수선택화면
			front.viewWrongInput("개수 선택이 잘못되었습니다");
			return 1;
		}
	}
}
