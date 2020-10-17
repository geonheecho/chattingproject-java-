package _09_oop3;

/*
 * JDK 1.8 부터 static 메서드와 디폴트 메서드는 예외적으로 사용 가능하게 허용됐음.
 */
/***설계***/
interface Hotel{
	public abstract boolean checkIn();

	//	public abstract boolean checkOut();
	boolean checkOut();

	//default 메서드 : Override 가능
	default void info() {
		System.out.println("checkIn(), checkOut()추상메서드와 ");
		System.out.println("checkResult() statc메서드가 있습니다.");
		System.out.println("checkIn()과 checkOut()의 결과를");
		System.out.println("checkResult()의 인자에 담아서 사용해보세요.");
	}

	//static 메서드 : Override 불가능
	static String checkResult(boolean isTrue) {
		return isTrue? "성공적으로 처리되었습니다" : "실패, 빈 방이 없거나 모두 빈 방입니다.";
	}
}

/***구현***/
class SeoulHotel implements Hotel{

	private int roomCnt;
	private int currentCnt;

	SeoulHotel(int roomCnt){
		this.roomCnt = roomCnt;
		this.currentCnt  = 0;
		System.out.println("[서울호텔] 방의 개수는 : "+ roomCnt);
	}

	@Override
	public boolean checkIn() {
		if(roomCnt > currentCnt) {
			System.out.println("체크인된 방 개수 : "+ ++currentCnt);
			return true;
		}else {
			return false;
		}	
	}

	@Override
	public boolean checkOut() {
		if(currentCnt > 0) {
			System.out.println("체크인된 방 개수 : "+ --currentCnt);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void info() {
		System.out.println("======================");
		Hotel.super.info();
		System.out.println("======================");
	}
}

public class _02_Interface2 {
	public static void main(String[] args) {
		SeoulHotel sh = new SeoulHotel(3);
		System.out.println(Hotel.checkResult(sh.checkIn()));
		System.out.println(Hotel.checkResult(sh.checkIn()));
		System.out.println(Hotel.checkResult(sh.checkIn()));
		System.out.println(Hotel.checkResult(sh.checkIn()));
		sh.info();
		System.out.println(Hotel.checkResult(sh.checkOut()));
		System.out.println(Hotel.checkResult(sh.checkOut()));
		System.out.println(Hotel.checkResult(sh.checkOut()));
		System.out.println(Hotel.checkResult(sh.checkOut()));
	}
}
