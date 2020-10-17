package _06_func;

import java.time.LocalDateTime;

public class _01_FunctionFormat {
//형태 1: input 값도 없고 output 값도 없는 형태
	public static void line() {
		System.out.println("=========");
	}
	
	//형태 2: input만 있는 형태
	public static void print(String str) {
		System.out.println(str);
	}
	//형태 3: output만 있는 형태
	public static String getTime() {
		return LocalDateTime.now().toString();
	}
	
	//형태 4: input과 output이 있는 형태
	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		line();
		print("Hello World");
		print(getTime());
		print(Integer.toString(add(10,20))); //30--->"30"
		//print(add(10,20)) ->error
	}
}
