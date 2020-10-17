package _95_usingMoreClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//동기화 되지 않는(unsynchronized) StringBuilder 보다는 동기화(synchronized)가 적용된 StringBuffer을 사용하자
//immutable한 String의 단점을 보완하기 위해서 StringBuffer 클래스를 익혀두자

public class _00_StringBuffer {
	public static void main (String []arg) {
		StringBuffer sb = new StringBuffer("자바마스터");
		sb.append("V8");	//문자 추가
		System.out.println(sb);
		System.out.println("=============");
		sb.setLength(0);	//문자 초기화
		sb.append(123456789);
		System.out.println(sb);
		System.out.println("=============");
		sb.reverse();	//문자열 반전
		System.out.println(sb);
		System.out.println("=============");
		sb.replace(2, 5, "ABCDE");	//선택된 문자열 변경
		System.out.println(sb);
		System.out.println("=============");
//		sb.insert()
		sb.setLength(0);
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		try {
			sb.append(keyboard.readLine());
			System.out.println(sb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
