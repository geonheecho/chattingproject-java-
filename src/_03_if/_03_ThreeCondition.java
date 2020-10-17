package _03_if;

public class _03_ThreeCondition {
public static void main(String[] args) {
	//삼항 조건문
	//(조건문)? 참일 떄 실행 : 거짓일 때 실행;
	
	int result =0;
	if(10!=10) {
		result = 1;
	}else {
		result =0;
	}
	System.out.println(result);
	
	result = (10==10)? 1:0;
	System.out.println((10==10)?1:0);
	
	result = (10 != 10)?1:(10>5)?10:5;
	System.out.println(result);
}
}
