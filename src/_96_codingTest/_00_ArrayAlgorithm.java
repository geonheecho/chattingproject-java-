package _96_codingTest;

import java.util.Arrays;

public class _00_ArrayAlgorithm {
	//오름차순 메서드
	public static void solution1(int[] arr) {	
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {	//앞과 뒤의 인덱스 비교(뒤의 작은 인덱스가 앞의 인덱스로 오게끔 설정)
					int tmp = arr[i];	// int tmp : 배열 인덱스 위치를 바꾸기 위한 임시보관 변수
					arr[i] = arr[j];
					arr[j] = tmp;
				}// if
			}// inner for
		}// outer for
		System.out.println(Arrays.toString(arr));
	}
	
	//내림차순 메서드
	public static void solution2(int[] arr) {	
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {	//앞과 뒤의 인덱스 비교(뒤의 큰 인덱스가 앞의 인덱스로 오게끔 설정)
					int tmp = arr[i];	// int tmp : 배열 인덱스 위치를 바꾸기 위한 임시보관 변수
					arr[i] = arr[j];
					arr[j] = tmp;
				}// if
			}// inner for
		}// outer for
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {5,1,7,10,8,3};
		int[] arr2 = new int[] {11,5,7,1,7,4,2};
		//오름차순
		solution1(arr1);
		solution1(arr2);
		//내림차순
		solution2(arr1);
		solution2(arr2);
	}
}
