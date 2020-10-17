package _04_for;

public class _03_While2 {
	public static void main(String[] args) {
		//break와 continue
		/*
		 * break문은 중지시키는 역할을 하였지만
		 * continue는 skip하는 역할을 한다.
		 * 
		 * break문은 반복문을 중지시키지만
		 * continue는 그 다음 반복문을 실행한다.
		 */
		
		int i = 0;
		while(i<5) {
			i++;
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}//while
		
	}//main
}//class
