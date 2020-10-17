package _97_exampleClass.service;

import _97_exampleClass.repository.DB;

public class OrderService {

	private DB db;

	public OrderService(DB database){
		db = database;
	}

	public void selling(int peekCoffee, int num, boolean isSold) {
		if(isSold) {
			num = -num;
		}
		db.updateStocks(peekCoffee, num);
		int priceOfPickedCoffee = db.readPrices()[peekCoffee-1];
		int total = db.readTotal();
		total += priceOfPickedCoffee * -num;
		db.updateTotal(total);
	}

	public boolean isDataInRange(int data, int start, int end) {
		if(data >= start && data <=end) {
			return true;
		}else {
			return false;
		}
	}
	
}
