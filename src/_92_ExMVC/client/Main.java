package _92_ExMVC.client;

import java.util.Scanner;

import _92_ExMVC.server.Controller;

interface Request{
	int LOGIN = 1, SIGNUP = 2, POSTING = 3, EXIT = 4;
}

public class Main {
	public static void main(String[] args) {
		boolean isExit = false;
		Controller controller = new Controller();
		Scanner sc = new Scanner(System.in);
		
		while(!isExit) {
			Object service = null;
			System.out.print("원하시는 서비스를 입력하세요 : ");
			int select = sc.nextInt();
			sc.nextLine(); //엔터 삭제
			switch(select) {
			case Request.LOGIN:
				System.out.println("아이디 입력");
				String id = sc.nextLine();
				System.out.println("비밀번호 입력");
				String pw = sc.nextLine();
				service = new Login(id, pw);
				break;
			case Request.SIGNUP:
				service = new SignUp();
				break;
			case Request.POSTING:
				service = new Posting();
				break;
			case Request.EXIT:
				isExit = true;
				break;
			}
			if(controller.doGet(service)) {
				System.out.println("응답 성공");
			}else {
				System.out.println("응답 오류");
			}
		}
		
		
	}
}
