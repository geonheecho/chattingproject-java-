package _98_classPractice.service;

import _98_classPractice.repository.Repository;

public class AdminService {

	private Repository db;

	public AdminService(Repository database) {
		db = database;
	}

	public boolean checkPassword(int inputPassword) {
		if(inputPassword == db.readPw()) {
			return true;
		}else {
			return false;
		}
	}

	public void changePassword(int newPassword) {
		db.updatePw(newPassword);
	}
		
		public boolean isNewPwInRange(int password) {
			if(password >= 1000 && password <= 9999) {
				return true;
			}else {
				return false;
		}
	}
		
	// pickCoffee : 선택한 커피
	//num : 선택한 커피의 개수
	// totalPrice : 공급할 재고의 총가격
	public boolean increaseStocks(int pickCoffee, int num) {
		int priceOfPickedCoffee = db.readPrices()[pickCoffee-1];
		int total = db.readTotal();
		int totalPrice = priceOfPickedCoffee*num;
		if(total >= totalPrice) {
			total-=totalPrice;
			db.updateStocks(pickCoffee, num);
			db.updateTotal(total);
			return true;
		}else { 
			return false;
		}
	}

	public boolean isDataInRange(int data, int start, int end) {
		if(data >= start && data <= end) {
			return true;
		}else {
			return false;
		}
	}
}