package _95_usingMoreClass;

public class _05_Math {
	public static void main(String[] args) {
//	abs() : 인자로 넘긴 데이터의 절댓값을 반환
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(0));
		System.out.println(Math.abs(10));

//	random() : 0.0 ~ 1.0 사이의 임의의 double형 데이터를 생성하여 반환
//						 특정 범위의 난수를 발생시킬 수 있음
		System.out.println((int)(Math.random()*10));		//0~9 사이 난수 발생
		System.out.println((int)(Math.random()*100));		//0~99 사이 난수 발생
		System.out.println((int)(Math.random()*1000));		//0~999 사이 난수 발생

//	max(), min() : 전달된 데이터 중 더 큰 수와 작은 수를 반환해주는 메소드
		System.out.println(Math.max(10, 100));
		System.out.println(Math.min(10, 100));
		
//	long round(double a) : 인수로 전달받은 실수를 소수점 첫 번째 자리에서 반올림한 결과를 반환
//	int round(double float) : "
		System.out.println(Math.round(12.56));

//	pow(double a, double b) : a와 b에 대해서 제곱연산 수행.(ex. (5,2)->25)
//	sqrt(double a) : 전달받은 값의 제곱근에 해당하는 값 반환 (16->4)
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(81));
	}
}
