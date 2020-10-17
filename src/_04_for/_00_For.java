package _04_for;

public class _00_For {
	public static void main(String[] args) {
		//1부터 10까지 숫자를 더하세요
		int sum=0;
		sum+=1; //sum=sum+1
		sum+=2;
		sum+=3;
		sum+=4;
		sum+=5;
		sum+=6;
		sum+=7;
		sum+=8;
		sum+=9;
		sum+=10;
		System.out.println(sum);

		sum = 0;
		//반복문 for 문 : 초기값, 조건식, 증감식
		for(int i =1; i<=100; i++) {
			sum +=i;
		}
		System.out.println(sum);

		//for문을 이용해서 0~50사이의 숫자중에 3으로 나누어 떨어지는 것끼리 더하기

		sum = 0;
		for(int i=0; i<=50; i++) {
			if(i%3==0){
				sum+=i;
			}
		}
		System.out.println(sum);

		//무한 반복을 할 때에는 반드시 탈출구가 있어야 된다. 조건 +break;
		int a = 0;
		for(;;) { //무한반복
			a++;
			System.out.println(a);
			if(a==100000) {
				System.out.println("탈출");
				break;
			}
		}


	}//main

}//class
