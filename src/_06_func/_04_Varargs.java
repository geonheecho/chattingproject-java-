package _06_func;

import java.util.Arrays;

public class _04_Varargs {
	
	/*
	 * 보통 함수를 호출할 때 인자의 수가 다르면 오류가 발생하지만
	 * 같은 자료형의 인자를 원하는 데로 input할 수 있게 만든 기능이다.
	 */
	
	public static int add(int... nums) {
		int result = 0;
		for(int i = 0; i <nums.length; i++) {
			result+=nums[i];
		}
		return result;
	}
	
	/*
	 * 보다시피, 가변인자는 배열 형태로 들어오게 된다.
	 */
	
	public static void argTest(String... strVarargs) {
		System.out.println("isArray ? ==>"+strVarargs.getClass().isArray());
		System.out.println(Arrays.toString(strVarargs));
	}
	
	//주의할점 : 가변인자는 무조건 맨 마지막에
	public static void argTest2(int num, String... strVarargs) {
	}
	
		
//	public static void argTest3(String... strVarargs, int num) {
//	}-->Error
	
	public static void main(String[] args) {
		System.out.println(add(100));
		int result1 = add(1,2,3,4);
		 int result2 = add(10,20,30,40,50,60);
		 System.out.println(result1);
		 System.out.println(result2);
		 argTest("a","b","c");
		 
	}
}