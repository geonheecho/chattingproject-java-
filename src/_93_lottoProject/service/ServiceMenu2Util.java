package _93_lottoProject.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import _93_lottoProject.repository.Student;
import _93_lottoProject.views.Views;

public class ServiceMenu2Util {
	Views view = new Views();
 

	public int[] makeRandomIndexOfArray(int pickCount, int size) {
		Random random = new Random();
		int[] randomResult = new int[pickCount];
		for(int i = 0; i <pickCount; i++) {
			randomResult[i] = random.nextInt(size);
			if(i != 0) {
				for(int j = 0; j < i; j++) {
					if(randomResult[j]==randomResult[i]) {
						i--;
						break;
					}
				} // for j
			} //if
		} // for i
		return randomResult;
	}


	public int getPickingCountsByClient(ArrayList<Student> list) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		int pickCount = 0;
		boolean isRightInput = false;
		while(!isRightInput) {
			try {
				System.out.print("당첨할 사람 수를 입력하세요. <[0]: 뒤로가기> : ");
				pickCount = Integer.parseInt(keyboard.readLine());
				view.line();
				if(pickCount < 0 || pickCount > list.size()) {
					System.out.println("<WrongInput!!!> 0 이상 " + list.size() + " 이하를 입력해주세요");
					view.line();
					continue;
				}else if(pickCount == 0){
					System.out.println("[0] 메뉴 선택 페이지로 돌아가기");
					isRightInput = true;
				}else {
					System.out.println(" ※ 총 당첨자 수 : "+pickCount);
					view.line();
					isRightInput = true;			
				}
			}catch(IOException io) {
			}catch(Exception e) {
				System.out.println("<WrongInput!!!> 숫자로 입력해주세요");
				view.line();
			}
		}
		return pickCount;
	}

}