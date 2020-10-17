package _04_for;

public class _04_DoWhile {
	public static void main(String[] args) {

		int i = 1;

		while(i<1){
			i++;
			System.out.println("1while문 안으로 진입함");
		}//while

		int j = 3;
		do {
			System.out.println("do-while문 안으로 진입함");
			j++;
		}while(j<3);

	}//main
}//class
