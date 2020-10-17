package _95_usingMoreClass;
//java.lang.String
public class _08_String {
	public static void main(String[] args) {
		String str = "A barking dog";
		String testb4 = "";
		String s1, s2, s3, s4;
		char ch1;
		int n1;
		boolean b1, b2, b3, b4;
		System.out.println(str);
		System.out.println("문자열의 길이 : "+str.length());
		s1 = str.concat(" never bites!");	//문자열 결합
		s2 = str.replace('b', 'B');	//문자 교환(b를 B로)
		s3 = str.substring(2,5);	//부분 문자열 추출(2번째 자리부터 4번째 자리까지 추출)
		s4 = str.toUpperCase();	//문자열 모두 대문자로 변환
		
		ch1 = str.charAt(2);		//해당위치의 문자 반환(char 형식)
		
		n1 = str.compareTo("The barking dog");	//사전적 순서대로 비교함(int 형식)
		
		b1 = str.equals("A Barking Dog");	//대소문자를 구분하여 비교함(boolean 형식)
		b2 = str.equalsIgnoreCase("a barking DOG");	//대소문자 구분없이 비교함(boolean 형식)
		b3 = str.isEmpty();	//문자열의 길이가 0이면 true 아니면 false(boolean 형식)
		b4 = testb4.isEmpty();
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(ch1);
		System.out.println(n1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
