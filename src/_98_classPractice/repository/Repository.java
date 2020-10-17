package _98_classPractice.repository;

/**
 * @author dlals
 *
 */
public class Repository {
	private String[] coffees = {"아메리카노", "카페 라떼", "에스프레소"}; //커피 종류
	private int[] stocks = {10, 10, 10}; //커피 재고
	private int[] prices = {2500, 4000, 3500}; //커피 가격
	private int pw = 1234; //관리자 비밀번호
	private int total = 0 ;
	private static boolean isCreatedOnce = false;
	private static Repository database = null;
	
	//singleton 패턴 [디자인 패턴]
	public static Repository createDatabase() {
		if(!isCreatedOnce) {
			System.out.println("새로운 DB객체를 만듭니다.");
			database = new Repository();
			isCreatedOnce = true;
			return database;
		}else {
			System.out.println("이미 DB객체가 생성되었습니다.");
			return database;
		}
	}
	
	private Repository() {}
	
	//CRUD : create read update delete
	public String[] readCoffees() {
		return coffees;
	}
	
	public int[] readStocks() {
		return stocks;
	}
	
	public int[] readPrices() {
		return prices;
	}
	public int readTotal() {
	return total;
	}
	
	public int readPw() {
		return pw;
	}
	
	/**
	 * @param pickCoffe : 1: 아메리카노, 2: 카페 라떼, 3: 에스프레소 ...
	 * @param num : 개수 (ex. 커피 주문으로 인한 감소 = 음수, 재고 증가로 인한 증가 = 양수)
	 * @return true면 성공, false면 실패
	 */
	public boolean updateStocks(int pickCoffee, int num) {
		int index = pickCoffee -1;
		if(pickCoffee >=1 && pickCoffee <=coffees.length) {
			stocks[index] += num;
			return true;
		}else {
			return false;
		}
	}
	
	public void updateTotal(int num) {
		total = num;
	}
	
	public void updatePw(int num) {
		pw = num;
	}
	}//class
