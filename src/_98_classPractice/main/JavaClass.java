package _98_classPractice.main;

import _98_classPractice.controller.AdminController;
import _98_classPractice.controller.MainController;
import _98_classPractice.controller.OrderController;
import _98_classPractice.repository.Repository;
import _98_classPractice.util.InputData;

public class JavaClass {
	public static void main(String[] args) {
		/**** Database****/
		Repository db = Repository.createDatabase();

		/****Config****/
		int choice= 0; //메인메뉴 선택
		InputData input = InputData.createInputDataFunction();
		int flag = 0;
		boolean isTerminated = false;
		int adminChoice =0; //관리자 메뉴 선택

		/****Controller****/
		MainController mainCon = new MainController(db);
		OrderController orderCon = new OrderController(db);
		AdminController adminCon = new AdminController(db);

		while(!isTerminated) {
			mainCon.showMainPage();
			choice = input.selectNum();
			switch(choice) {
			
			// //////////////////주문하기///////////////////////
			case 1: 		
				/*
				 * 0 : 메뉴 선택지 페이지
				 * 1 : 개수 선택지 페이지
				 * 2 : 메인 화면으로 돌아가기
				 */
				int selectedCoffee = 0;
				int num = 0;
				while(true) {
					if(flag == 0) {
						orderCon.showMenuPage();
						selectedCoffee=input.selectNum();
						flag = orderCon.showCoffeeNumPage(selectedCoffee);
					}
					if(flag == 1) {
						num = input.selectNum();
						flag = orderCon.ordering(selectedCoffee, num);
					}
					if(flag == 2) {
						break; //while(inner1)문 파괴
					}
				}	//while(inner1)
				flag = 0;
				break;
		
				////////////////////관리자페이지///////////////////////////
			case 2 :		
				boolean isAbc = false;
				boolean isABC = false;

				while(!isAbc) {
					adminCon.showAdminPwPage();
					int pw = input.selectNum();
					while(adminCon.authCheck(pw)) {
						if(true) {
						while(!isABC) {
							adminCon.showAdminChoicePage();
							adminChoice = input.selectNum();
							
							switch(adminChoice){
							case 1 :		//재고&매출액
								adminCon.showAllInfor();
								break;
							case 2 :		//재고 공급
								int selectedCoffee1 = 0;
								int num1 = 0;
								while(true) {
									if(flag == 0) {
										adminCon.showMenuFromAdmin();
										selectedCoffee1=input.selectNum();
										flag = adminCon.showSupplyCoffees(selectedCoffee1);
									}
									if(flag == 1) {
										num1 = input.selectNum();
										flag = adminCon.supplying(selectedCoffee1, num1);
									}
									if(flag == 2) {
										break; //while(inner1)문 파괴
									}
								}	//while(inner1)
								flag = 0;
								break;
							case 3 :		//PW 변경
								int oldPassword = 0;
								int newPassword = 0;
								while(true) {
									if(flag == 0) {
										adminCon.showOldPassword();
										oldPassword = input.selectNum();
										flag = adminCon.checkPw(oldPassword);
									}
									if(flag ==1) {
										adminCon.showNewPassword();
										newPassword = input.selectNum();
										flag = adminCon.changPw(newPassword);
									}		
									if(flag == 2) {
										break; //while(inner2) 파괴
									}
								} // while(inner2)
								flag = 0 ;
								break;
							case 4 :	//나가기
								isABC=true; //while(isABC) 파괴
								if(isABC = true) {
									isAbc = true;
								}
								break;
							default :
								mainCon.showErrorPage();
								break;
							}//switch(inner)
						}//while (isABC)
					}//if
						break;
					} //while (admin)
					break;
					}//while(isAbc)
				break;
			
				////////////////프로그램 종료///////////////////////
			case 3 :		
				mainCon.confirmTerminate();
				int check = input.selectNum();
				if(mainCon.processTerminate(check)==0) {
					isTerminated = true;
				}
				break;
			default :
				mainCon.showErrorPage();
				break;

			}//switch(outer)
		}//while(outer)
	}//class

}
