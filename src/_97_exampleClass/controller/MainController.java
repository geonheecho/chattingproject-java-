package _97_exampleClass.controller;

import _97_exampleClass.repository.DB;
import _97_exampleClass.service.MainService;
import _97_exampleClass.view.ViewPages;

public class MainController {
	private DB db;
	private ViewPages front;
	private 	MainService mainService;
	
	public MainController(DB database){
		db = database;
		front = new ViewPages(db);
		mainService = new MainService(db);
	}
	
	public void showMainPage() {
		front.viewMain();
	}
	
	public void showErrorPage() {
		front.viewWrongInput(null);
	}
	
	public void confirmTerminate() {
		front.viewAskTerminate();
	}
	
	public int processTerminate(int check) {
		String response = mainService.terminate(check);
		if(response.equals("종료")) {
			front.viewWhenTerminate();
			return 0;
		}else if(response.equals("취소")) {
			return 1;
		}else {
			front.viewWrongInput(response);
			return -1;
		}
	}
}
