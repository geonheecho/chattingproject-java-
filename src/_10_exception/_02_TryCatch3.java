package _10_exception;

public class _02_TryCatch3 {
	public static void main(String[] args) {
		try {
//			int num =10/0; //ArithmeticException
			
			String[] strArr = new String [5];
			strArr[10] = "hello"; //ArrayIndexOutOfBoundsException
		}catch(ArithmeticException error) {
			System.out.println("0으로 나눌 순 없음 : "+error);
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("인덱스 초과 : "+error);
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
		System.out.println("프로그램 정상 종료");
	}
}
