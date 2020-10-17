package _10_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserException extends Exception{
	UserException(){
		super("유저 정보가 맞지 않습니다.");
	}
}

public class _04_UserException {

	public static void service() throws UserException, IOException{
		String id = "ROB";
		String password = "1234";

		BufferedReader keyboard  = new BufferedReader(new InputStreamReader(System.in));
		boolean isTerminate = false;
		while(true) {
			if(isTerminate) {
				System.out.println("@@@서비스 종료@@@");
				break;
			}
			System.out.println("---서비스 선택---");
			System.out.println("[1] 로그인");
			System.out.println("[2] 종료");

			String command = keyboard.readLine();

			switch(command) {
			case"1" :
				System.out.println("{id 입력}");
				String checkid = keyboard.readLine();
				System.out.println("{password 입력}");
				String checkpassword = keyboard.readLine();
				if(checkid.equals(id)&&checkpassword.equals(password)) {
					System.out.println("로그인 성공");
				}else {
					throw new UserException();
				}
				break;
			case"2" :
				isTerminate = true;
				break;
			default :
				System.out.println("(((지원되지 않는 서비스입니다)))");
			}
		}//while
	}



	public static void main(String[] args) {
		try {
			service();
			System.out.println("정상종료");
		}catch(UserException error){
			System.out.println(error.getMessage());
			System.out.println("비정상 종료");
		}catch(IOException e) {
			System.out.println(e);
			System.out.println("비정상 종료");
		}
	}
}

