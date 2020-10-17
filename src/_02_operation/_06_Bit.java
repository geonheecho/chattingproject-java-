package _02_operation;

public class _06_Bit {
	public static void main(String[] args) {
		//비트연산자(&,|,^,~<<,>>)
		//1bit : 0,1 -->1은 true , 0은 false
		//10진법을 2진법으로 나타내는 방법
		int a = 15, b = 8;
		String sa = Integer.toBinaryString(a); 
		String sb = Integer.toBinaryString(b);
		System.out.println(sa);
		System.out.println(sb);

		System.out.println(a&b);
		byte check = 0b1000; //0b:2진법, 0:8진법, 0x: 16진법
		System.out.println(check);
		
		/*
		 *  &: and
		 *  | : or
		 *  ^: xor -->true+false여야만 =true 
		 *  ~: not
		 */

		//Shift연산자 <<,>>
		System.out.println(1<<3); // 0001->0010->0100->1000
		System.out.println(15>>2);//1111->0111->0011
		

	}
}
