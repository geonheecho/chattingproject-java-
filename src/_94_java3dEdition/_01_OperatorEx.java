package _94_java3dEdition;

public class _01_OperatorEx {

	public static void PrefixPostfix() {
		int i = 5, j = 0;

		j = i++;
		System.out.println("j=i++; 실행 후, i = "+ i +", j =" + j);

		i=5;
		j=0;
		j = ++i;
		System.out.println("j=++i; 실행 후, i = "+ i +", j =" + j);	
	}

	public static void CharOperator() {
		char c = 'a';
		for(int i = 0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();

		c = 'A';
		for(int i = 0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();

		c = '0';
		for(int i = 0; i<10; i++) {
			System.out.print(c++);
		}
		System.out.println();

		//대문자와 소문자 간의 코드값 차이는 10진수로 32이다.
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		System.out.println(upperCase);
		//char형과 int형 간의 뺄셈연산 결과는 int형이므로, 연산 후 char형으로 다시 형변환해야 한다는 것을 잊지 말자.
	}

	public static void MathRoundEx() {
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);
		//1000.0이 아닌 1000으로 나누었다면, 3.142가 아닌 3을 결과로 얻었을 것이다.
	}

	public static void RemainderEx() {
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		//피연산자의 부호를 모두 무시하고, 나머지 연산을 한 결과에 왼쪽 피연산자(나눠지는 수)의 부호를 붙이면 된다.
	}

	public static void ComparisonEx1() {
		float f = 0.1f;
		float f2 =10.0f;
		double d = 0.1;
		double d1 = 10.0;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f %b%n", d1==f2);
		System.out.printf("0.1 == 0.1f %b%n", d==f);
		/*
		 * // 10.0 == 10.0f -> true , 0.1 == 0.1f -> false WHY?? 
		 * 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 있다.  
		 * float f = 0.1f; (f에 0.10000000149011612로 저장됨) 
		 * double d = 0.1; (d에 0.10000000000000000로 저장됨) 
		 * float타입의 값을 double타입으로 형변환하면, 부호와 지수는 달라지지 않고 그저 가수의 빈자리를 0으로 채울뿐, 
		 * 형변환을 했다고 해서 오차가 적어지는 것이 아니다.
		 */		
		System.out.printf("f =%19.17f%n", f);
		System.out.printf("d =%19.17f%n", d);
		System.out.printf("d2 =%19.17f%n", d2);
		System.out.printf("d==f %b%n", d==f);
		System.out.printf("d==d2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
	}
	
	public static void main(String[] args) {
		PrefixPostfix();
		System.out.println("===================");
		CharOperator();
		System.out.println("===================");
		MathRoundEx();
		System.out.println("===================");
		RemainderEx();
		System.out.println("===================");
		ComparisonEx1();
	}
}
