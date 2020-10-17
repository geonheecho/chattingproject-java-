package _91_quizQuickStart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	BufferedReader keyboard;
	Page view = new Page();

	Input(){	
	}

	String inputString() {
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		try {
			System.out.print("[입력]>>");
			result = keyboard.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	int inputInteger() {
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		while(true) {
			try {
				System.out.print("[입력]>>");
				String tmp = keyboard.readLine().trim();
				result = Integer.parseInt(tmp);
				return result;
			} catch (IOException e) {
				e.printStackTrace();
			}catch(NumberFormatException nf) {
				System.out.println("숫자로 입력해주세요.");
			}
		}
	}

	String inputOnlyEnterOrZero() {
		String result = "";
		while(true) {
			String select = inputString();
			if(select.equals("") || select.equals("0")) {
					result = select;
					break;
				}else if(Main.LIMIT_TIME==0){
					break;
				}else {
					System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
				}
			}
		return result;
	}
	
	void closeInputTerminal() {
		try {
			keyboard.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}//class
