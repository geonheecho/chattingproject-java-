package _14_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _04_Collections {
	public static void main(String[] args) {
		int[] numArr = {4,2,3,7,9,1};
		String result = Arrays.toString(numArr);
		System.out.println(result);	//original
		int[] copy = Arrays.copyOfRange(numArr, 0, numArr.length);
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));	//정렬 후
		
		ArrayList al = new ArrayList();
		System.out.println(Arrays.toString(copy));
		for(int num : copy) {
			al.add(num);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println("정렬후: "+al);
	}
}
