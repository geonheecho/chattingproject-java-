package _96_codingTest_test;

import java.util.Arrays;

public class Solution2 {
	public String[] solution(String[] orders, int[] course) {
		String[] answer = {};

		String[] checkOrderList = new String[10];
		for(String order : orders) {
			for(int i=0; i<order.length(); i++) {
			}
		}

		return answer;
	}


	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2, 3, 4};
		//		Solution2 solution = new Solution2();
		//		String[] answer = solution.solution(orders, course);

		String[] checkOrderList = new String[10];
		for(String order : orders) {
			for(int i=0; i<checkOrderList.length; i++) {
				if(checkOrderList[i] == null) {
					if(i<order.length()) {
						checkOrderList[i] = order.substring(i, i+1);
					} else {
						checkOrderList[i] = "";
					}
				} else if(checkOrderList[i] == "") {
					for(int k=0; k<order.length(); k++) {
						String temp = order.substring(k, k+1);
						int countUnmatch = 0;
						int notNull = 0;
						for(int m=0; m<checkOrderList.length; m++) {
							if(checkOrderList[m] != "") {
								if(!temp.equals(checkOrderList[m].substring(checkOrderList[m].length()-1))) {
									countUnmatch++;
								}
								notNull++;
							}
						}
						if(countUnmatch == notNull) {
							checkOrderList[i] = temp;
							break;
						}
					}
				} else {
					for(int j=0; j<order.length(); j++) {
						if(checkOrderList[i].substring(checkOrderList[i].length()-1).equals(order.substring(j, j+1))) {
							checkOrderList[i] += order.substring(j, j+1);
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(orders));
		System.out.println(Arrays.toString(checkOrderList));
		
		for(int i=0; i<checkOrderList.length; i++) {
			int i_length = checkOrderList[i].length();
			for(int j=0; j<checkOrderList.length; i++) {
				int j_length = checkOrderList[j].length();
			}
		}
	}
}
