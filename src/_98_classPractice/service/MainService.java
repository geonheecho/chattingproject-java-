package _98_classPractice.service;

import _98_classPractice.repository.Repository;

public class MainService {
	
	private Repository db;
	
	public MainService(Repository database) {
		db = database;
	}
	
	public String terminate(int check) {
		if(check ==1 ) {
			return "종료";
		}else if(check == 2) {
			return "취소";
		}else {
			return "오류";
		}
	}
}//class
