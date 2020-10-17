package _04_for;

public class _01_For2 {
	public static void main(String[] args) {
		//중첩 for문 : for문 안에 for문이 있다. 이중 for문까지만 권장... 삼중 이상 되면 기하급수적으로 성능저하
		for(int i =1 ; i <=3; i++) {
			for(int j = 1 ; j<=3; j++) {
				System.out.println("i: "+i+", j:"+j);
			}//inner for
		}//outer for

		//구구단 만들기 : 이중 for문 이용해서
		for(int i=2; i<=9; i++) {
			System.out.println();
			for(int j =1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}

		//3x3형식의 구구단 만들기
//		사망한 코드
//		for(int i=1; i<=9; i++) {
//			System.out.println();
//			for(int j =1; j<=9; j++) {
//				System.out.printf("\n%d * %d = %2d", i, j, i*j);
//			}
//		}
		System.out.println();

		for(int i = 1; i <=9; i+=3) {
			System.out.printf("\t%d단\t\t\t%d단\t\t\t%d단\n",i,i+1,i+2);
			for(int j = 1; j <=9; j++) {
				System.out.printf("%d * %d = %d\t%d * %d = %d\t%d * %d = %d\n",
						i, j, i*j,
						i+1, j, (i+1)*j,
						i+2, j, (i+2)*j);
			}
			System.out.println();
		}



	}//main
}//class