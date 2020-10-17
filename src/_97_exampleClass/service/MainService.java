package _97_exampleClass.service;

import _97_exampleClass.repository.DB;

public class MainService {
	
	private DB db;
	
	public MainService(DB database){
		db = database;
	}
	
	public String terminate(int check) {
		if(check == 1) {
			return "종료";
		}else if(check == 2) {
			return "취소";
		}else {
			return "오류";
		}
	}
}
