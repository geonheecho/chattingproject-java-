package _10_exception;

public class _01_TryCatch2 {

	public static void main(String[] args) {
		System.out.println("에러전 출력확인");
		int[] arr = new int[5];
		try {
			arr[5] =10; 
		}catch(Exception e){
			System.out.println(e);
			System.out.println("배열 index가 잘못 되었습니다");
		}
		System.out.println("에러후 출력확인");
	}
}
