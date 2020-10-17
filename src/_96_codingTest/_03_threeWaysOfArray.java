package _96_codingTest;

import java.util.Arrays;

public class _03_threeWaysOfArray {
	public static void bubbleSortEx(int[] numArr) {
		int temp;
		for(int i = 0; i < numArr.length; i++) {
			for(int j = 0; j<numArr.length-i-1; j++) {
				if(numArr[j]>numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];				
					numArr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
	}
	
	public static void selectSortEx(int[] numArr) {
		int temp;
		for(int i = 0; i<numArr.length-1; i++) {
			for(int j = i+1; j<numArr.length; j++) {
				if(numArr[i]>numArr[j]) {
					temp = numArr[j];
					numArr[j] = numArr[i];
					numArr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
	}

	public static void insertionSortEx(int[] numArr) {
		int temp;
		int j;
		for(int i = 1; i<numArr.length; i++) {
			temp = numArr[i];
			for(j = i-1; j>=0 && numArr[j]>temp; j--) {
				numArr[j+1] = numArr[j];
			}
			numArr[j+1] = temp;
		}
		System.out.println(Arrays.toString(numArr));
	}
	
	public static void main(String[] args) {
		int[]	numArr = {254, 3, 213, 64, 75, 56, 4, 324, 65, 78, 9, 5, 76, 3410, 8, 342, 76};
		bubbleSortEx(numArr);
		selectSortEx(numArr);
		insertionSortEx(numArr);
	}
}
