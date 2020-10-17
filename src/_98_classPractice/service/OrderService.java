package _98_classPractice.service;

import _98_classPractice.repository.Repository;

public class OrderService {
	
	private Repository db;
	
	public OrderService(Repository database) {
	db = database;
	}

	public void selling(int pickCoffee, int num, boolean isSold) {
		if(isSold) {
			num= -num;
		}
		db.updateStocks(pickCoffee, num);
		int priceOfPickedCoffee = db.readPrices()[pickCoffee-1];
		int total = db.readTotal();
		total += priceOfPickedCoffee* -num;
		db.updateTotal(total);
	}
	
	public boolean isDataInRange(int data, int start, int end) {
		if(data >= start && data <= end) {
			return true;
		}else {
			return false;
		}
	}
}//class
