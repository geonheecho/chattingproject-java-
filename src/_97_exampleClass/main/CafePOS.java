package _97_exampleClass.main;

import _97_exampleClass.controller.AdminController;
import _97_exampleClass.controller.MainController;
import _97_exampleClass.controller.OrderController;
import _97_exampleClass.repository.DB;
import _97_exampleClass.util.InputData;

public class CafePOS {
	public static void main(String[] args) {
		/**** Database ****/
		DB db = DB.createDatabase();
		//DB db1 = DB.createDatabase();

		/**** config ****/
		int choice = 0;
		InputData input = InputData.createInputDataFunction();
		int flag = 0;
		boolean isTerminated = false;

		/**** controller ****/
		MainController mainCon = new MainController(db);
		AdminController adminCon = new AdminController(db);
		OrderController orderCon = new OrderController(db);

		while(!isTerminated) {
			mainCon.showMainPage();
			choice = input.selectNum();
			switch(choice) {
			case 1: //Order
				/*
				 * 0 : 메뉴 선택 페이지
				 * 1 : 개수 선택 페이지
				 * 2 : 메인 화면으로 돌아가기
				 */
				int selectedCoffee = 0;
				int num = 0;
				while(true) {
					if(flag == 0) {
						orderCon.showMenuPage();
						selectedCoffee = input.selectNum();
						flag = orderCon.showCoffeeNumPage(selectedCoffee);
					}
					if(flag == 1) {
						num = input.selectNum();
						flag = orderCon.ordering(selectedCoffee, num);
					}
					if(flag == 2) {
						break;
					}
				}
				flag = 0; //메인화면 돌아가기전 flag 초기화
				break;
			case 2: //Admin
				adminCon.showAdminPage();
				int pw = input.selectNum();
				adminCon.authCheck(pw);
				break;
			case 3://Exit
				mainCon.confirmTerminate();
				int check = input.selectNum();
				if(mainCon.processTerminate(check) == 0) {
					isTerminated = true;
				}
				break;
			default:
				mainCon.showErrorPage();
				break;
			}
		}
	}
}
