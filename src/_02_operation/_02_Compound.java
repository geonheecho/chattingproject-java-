package _02_operation;

import java.util.Scanner;

public class _02_Compound {
	public static void main(String[] args) {
		//복합연산자(+=,-=,*=,/=,%=)
		/*
		 * a-=b>>>a=a-b
		 * a*=b>>>a=a*b
		 */
		Scanner sc = new Scanner(System.in);
		
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
		
			
		sc.close();
	}
}
