package _02_operation;

import java.util.Scanner;

public class _00_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //System.in은 키보드
//		sc.next(); //문자입력(공백까지)
//		sc.nextLine(); //문자입력인데 엔터를 만나면 입력(엔터까지)
//		sc.nextInt(); //int를 입력
//		sc.nextLong(); //long을 입력
//		등등 ( doc api 8 doc)
		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		System.out.print("문자 입력 : ");
//		String str = sc.next();
//		System.out.print("이름 입력 :");
//		String name =sc.next();
//		System.out.printf("정수: %d 문자:%s 이름:%s",num,str,name);
		
		//next()와 nextLine()
		//A, B, C 입력해보기
		System.out.println("====str1 입력====");
		String str1=sc.next();
		System.out.println("=====str2 입력====");
		String str2=sc.next();
		String str3=sc.nextLine();
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		System.out.println("str3 :"+str3);
		
				
		
		sc.close();
	}
}
