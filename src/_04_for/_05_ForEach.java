package _04_for;

public class _05_ForEach {
	public static void main(String[] args) {
		int[] numArr = {1,2,3,4,5};
		//원래 정석
//		for(int i = 0; i<numArr.length; i++) {
//			System.out.println(numArr[i]);
//		}

		for(int num : numArr) {
			System.out.println(num);
		}
	}
}
