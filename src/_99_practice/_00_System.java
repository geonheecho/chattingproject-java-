package _99_practice;


public class _00_System{
	public static void main(String[] args) {
	//3. 구구단만들기
		for(int i = 1; i <= 9; i+=3) {
			System.out.printf("\n\t%d단\t\t\t%d단\t\t\t%d단\n",i,(i+1),(i+2));
			for(int j = 1; j <= 9; j++) {
				System.out.printf("\t%d*%d=%d\t\t%d*%d=%d\t\t%d*%d=%d\n",
						i,j,i*j,
						(i+1),j,(i+1)*j,
						(i+2),j,(i+2)*j);
			}
		}
		
		
	}//main
}//class