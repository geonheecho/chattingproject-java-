package _97_exampleClass.repository;


public class DB {
	private String[] coffees = {"아메리카노", "카페 라떼", "에스프레소"}; //커피 종류
	private int[] prices = {3500, 4000, 2500}; //커피 가격
	private int[] stocks = {10, 10, 10}; //커피 재고
	private int pw = 1234; // 관리자 비밀번호
	private int total = 0; // 총 매출액
	private static boolean isCreatedOnce = false;
	private static DB database = null;
	
	//singleton 패턴 [디자인 패턴]
	public static DB createDatabase() {
		if(!isCreatedOnce) {
			System.out.println("새로운 DB객체를 만듭니다.");
			database = new DB();
			isCreatedOnce = true;
			return database;
		}else {
			System.out.println("이미 DB객체가 생성되었습니다.");
			return database;
		}
	}
	
	private DB(){}
	
	//CRUD : create, read, update, delete 
	public String[] readCoffees() {
		return  coffees;
	}
	
	public int[] readPrices() {
		return prices;
	}
	
	public int[] readStocks() {
		return stocks;
	}
	
	/**
	 * 
	 * @param peekCoffee : 1 : 아메리카노, 2 : 카페 라떼, 3 : 에스프레소
	 * @param num : 개수 (ex. 커피 주문으로 인한 감소 = 음수, 재고 증가로 인한 증가 = 양수)
	 * @return true면 성공, false면 실패
	 */
	public boolean updateStocks(int peekCoffee, int num) {
		int index = peekCoffee -1;
		if(peekCoffee>=1 && peekCoffee<=3) {
			stocks[index] += num;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkPassword(int inputPassword) {
		if(inputPassword == pw) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean changePassword(int oldPassword, int newPassword) {
		if(oldPassword == pw) {
			oldPassword = newPassword;
			return true;
		}else {
			return false;
		}
	}
	
	public int readTotal() {
		return total;
	}
	
	public void updateTotal(int num) {
		total = num;
	}
}
