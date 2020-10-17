package _10_exception;

public class _00_TryCatch {
	public static void main(String[] args) {
		System.out.println("에러전 출력확인");
		int[] arr = new int[5];
		arr[5] =10; //에러 발생후 main()이 stack에서 나가면서 Jvm이 에러를 catch해 해당 에러를 출력
		//에가 발생 시 생성되는 객체 Exception
		System.out.println("에러후 출력확인");
	}
	
	
}
