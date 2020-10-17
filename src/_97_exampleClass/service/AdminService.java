package _97_exampleClass.service;

import _97_exampleClass.repository.DB;

public class AdminService {

	private DB db;
	
	public AdminService(DB database) {
		db = database;
	}
	
	public boolean checkAdminPw(int inputPassword) {
		return db.checkPassword(inputPassword);
	}
	
	public boolean changeAdminPw(int oldPassword, int newPassword) {
		return db.changePassword(oldPassword, newPassword);
	}

}
