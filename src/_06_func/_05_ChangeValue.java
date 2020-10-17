package _06_func;

import java.util.Arrays;

public class _05_ChangeValue {

	//primitive variable control --> call by value
	public static int changeNum(int num) {
		num = 20;
		return num;
	}

	//reference variable control --> call by reference
	public static void changeArr(int[] nums) {
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
	}

	//immutable : 상수, 선언시 혹은 초기화시 한번 값이 결정되면 값은 절대로 안바뀐다.
	//mutable : 변수, 초기화할 때의 값은 얼마든지 바뀔 수 있다.
	//String 클래스는 immutable의 대표적인 클래스다.
	public static void changStr(String str) {
		str = "안녕하세요";
	}

	public static void main(String[] args) {
		//num을 함수를 이용해서 20으로 만들기
		int num = 10;
		changeNum(num); //여전히 num은 10이다.
		num = changeNum(num);
		System.out.println(num);

		//[1,2,3,4] 배열을 [10,20,30,40] 배열로 만들기 -->함수를 이용해서
		int[] numArr = {1,2,3,4};
		System.out.println("changeArr() 사용전 : "+Arrays.toString(numArr));
		changeArr(numArr);
		System.out.println("changeArr() 사용후 : "+Arrays.toString(numArr));

		//"안녕"을 "안녕하세요"로 함수를 이용해서 만들기
		String str = "안녕";
		System.out.println("changStr() 사용전 : "+ str);
		changStr(str);
		System.out.println("changStr() 사용후 : "+ str);
		
		System.out.println("성능 저하 체감 전");
		for(int i = 0; i <=10000; i++) {
			str +=i;
		}
		System.out.println("성능 저하 체감 후");
	}
}
