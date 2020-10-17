package _96_codingTest;

public class _01_Stars {
	public static void BasicStar(){
		for(int i = 1; i<=5; i++) {		//5개의 줄 생성
			for(int j = 1; j<=5; j++) {		//줄마다 5번씩 별 반복생성
				System.out.print("*");
			}//inner for
			System.out.println();		//줄바꿈
		}//outer for
	}

	public static void LeftTriangle() {
		for(int i = 1; i<=5; i++) {		//5개의 줄 생성
			for(int j = 1; j<=i; j++) {		//행의 순서만큼(첫번째 줄이면 1, 두번째 불이면 2, ... )반복
				System.out.print("*");
			}
			System.out.println();		//줄바꿈
		}
	}

	public static void LeftDownTriangle() {
		for(int i = 0; i<5; i++) {
			for(int j = 5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void RightTriangle() {
		for(int i = 1; i<=5; i++) {		//5개의 줄 생성
			for(int j = 5; j>0; j--) {		//5개의 줄이므로 5에서부터 줄어들며 반복수행(5x5)
				if(j>i) {		//줄의 순서(ex. n번째 줄)보다 큰 경우 -> 공백과 *이 전환되는 부분 기준 왼쪽일 경우
					System.out.print("  ");		//공백출력
				}
				else		//줄의 순서보다 작거나	같은경우(== 공백과 *이 전환되는 부분을 포함해서 오른쪽일 경우)
					System.out.print("*");		//*출력
			}
			System.out.println();		//줄바꿈
		}
	}

	public static void RightDownTriangle() {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i; j++) {
			System.out.print("  ");
			}
			for(int j = 5; j>i; j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void RhombusEx() {
		int a = 1;		//*칸의 시작개수
		int b = 3;		//공백의 시작개수

		for(int i = 0; i<7; i++) {		//7개의 줄 생성
			if(i<3) {		//1번째 줄부터 3번째 줄까지의 경우
				for(int j = b; j>0; j--) {		//b(공백)의 크기만큼 반복
					System.out.print("  ");
				}
				for(int j = 0; j<a; j++) {		//a(*)의 크기만큼 반복
					System.out.print("*");
				}
				for(int j = b; j>0; j--) {		//b(공백)의 크기만큼 반복
					System.out.print("  ");
				}
				System.out.println();		//한줄의 출력이 끝나면 줄바꿈
				a+=2;		//a(*)의 크기 2증가
				b--;		//b(공백)의 크기 1감소

			}else {		//4번째 줄부터 7번째 줄까지의 경우
				for(int j = 0; j<b; j++) {		//b(공백)의 크기만큼 반복
					System.out.print("  ");
				}
				for(int j = a; j>0; j--) {		//a(*)의 크기만큼 반복
					System.out.print("*");
				}
				for(int j = 0; j<b; j++) {		//b(공백)의 크기만큼 반복
					System.out.print("  ");	
				}
				System.out.println();		//한줄의 출력이 끝나면 줄바꿈
				a-=2;		//a(*)의 크기 2감소
				b++;		//b(공백)의 크기 1증가
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("<직사각형>");
		BasicStar();
		System.out.println("<직각삼각형(왼쪽)>");
		LeftTriangle();
		System.out.println("<직각삼각형(왼쪽반전)>");
		LeftDownTriangle();
		System.out.println("<직각삼각형(오른쪽)>");
		RightTriangle();
		System.out.println("<직각삼각형(오른쪽반전)>");
		RightDownTriangle();
		System.out.println("<마름모Ex>");
		RhombusEx();
	}
}//class
