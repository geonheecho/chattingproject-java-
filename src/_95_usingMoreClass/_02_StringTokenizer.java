package _95_usingMoreClass;

import java.util.StringTokenizer;

//String 클래스 split()함수가 문자열을 쪼개 배열에 저장해주는 함수였다면,
//StringTokenizer 클래스는 보다 간단하게 문자열을 토큰 단위로 나눠주는 함수이다.
public class _02_StringTokenizer {
	public static void main(String[] args) {
//구분자의 default 값은 공백으로, 구분자를 입력하지 않으면 공백에서 끊어준다.
		String phoneNum = "TEL 82-02-997-2059";
		StringTokenizer str1 = new StringTokenizer(phoneNum);
		while(str1.hasMoreTokens())
			System.out.println(str1.nextToken());
		
//공백과 구분자를 모두 토큰으로 사용할 수 있다.
		StringTokenizer str2 = new StringTokenizer(phoneNum, "-");
		while(str2.hasMoreTokens())
			System.out.println(str2.nextToken());
		System.out.println("=======================");

//boolean과 함께 쓸 경우, true일때는 구분자를 포함, false일때는 구분자를 제외하고 출력한다.
		String javaCode = "num+=1";
		StringTokenizer str3 = new StringTokenizer(javaCode, "+=", true);
		while(str3.hasMoreTokens())
			System.out.println(str3.nextToken());
		System.out.println("=======================");
		StringTokenizer str4 = new StringTokenizer(javaCode, "+=", false);
		while(str4.hasMoreTokens())
			System.out.println(str4.nextToken());
	}
}
