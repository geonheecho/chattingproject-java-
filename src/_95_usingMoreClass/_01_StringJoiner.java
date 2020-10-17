package _95_usingMoreClass;

import java.util.StringJoiner;

//StringBuffer 또는 StringBuilder에서 공백이나 구분자("-", "[", "]") 사용시 반복코딩이 길어지는 경우가 생김
//이러한 단점을 보완한 StringJoiner를 익혀두자 

public class _01_StringJoiner {	
	public static void ex1() {
		String str1 = "One";
		String str2 = "Day";
		String str3 = "Commit";
		//번거러움의 예
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append("-");
		sb.append(str2);
		sb.append("-");
		sb.append(str1);
		sb.append("-");
		sb.append(str3);
		System.out.println(sb);

		//StringJoiner로 보완
		StringJoiner sj1 = new StringJoiner("-");
		sj1.add(str1);
		sj1.add(str2);
		sj1.add(str1);
		sj1.add(str3);
		System.out.println(sj1);
		sj1.length();
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner("^");
		sj2.add(str1);
		sj2.add(str2);
		sj2.add(str1);
		sj2.add(str3);
		StringJoiner sj = sj1.merge(sj2);
		System.out.println(sj.toString());
	}

	public static void ex2() {
		String[] strArr = new String[] {"Lion", "Tiger", "Bear", "Cow", "Pig"};
		StringJoiner wholeJoiner = new StringJoiner(",\n\t", "\t", "");
		for(int i = 0; i<strArr.length; i++) {
			StringJoiner keyJoiner = new StringJoiner("", "\"", "\"");
			StringJoiner valueJoiner = new StringJoiner("", "\"", "\"");
			StringJoiner keyAndValueJoiner = new StringJoiner(" : ");
			
			keyJoiner.add("Animal" +(i+1));
			valueJoiner.add(strArr[i]);
			
			keyAndValueJoiner.add(keyJoiner.toString());
			keyAndValueJoiner.add(valueJoiner.toString());
			
			wholeJoiner.add(keyAndValueJoiner.toString());
		}
		System.out.println(wholeJoiner.toString());
	}

	public static void main(String[] args) {
		ex1();
		System.out.println("---------------------------------");
		ex2();
	}
}
