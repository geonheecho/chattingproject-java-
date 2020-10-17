package _93_lottoProject.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import _93_lottoProject.repository.DB;
import _93_lottoProject.service.Service;
import _93_lottoProject.views.Views;

interface Request{
	int LOTTO_NORMAL = 1, LOTTO_MULTI = 2, LOTTO_RATE = 3, EXIT = 0;
}

public class Main {
	BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	Views view = new Views();
	Service handler;
	DB db;

	void selectFile() {
		System.out.print("파일경로 입력(없으면 그냥 Enter키) : ");
		try {
			String inputFileName = (keyboard.readLine()).trim();
			this.db = DB.createDB(inputFileName);
			this.handler = new Service(db);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	int selectMenu() {
		boolean isRightInput = false;
		int select = 0;
		while(!isRightInput) {
			view.showMenuPage();
			try {
				select = Integer.parseInt((keyboard.readLine()).trim());
				if(select>3 || select<0) {
					view.line();
					System.out.println("<WrongInput!!!>해당서비스는 존재하지 않습니다. 보기의 메뉴 중 선택해주세요!");
				}else {
					view.line();
					System.out.println("["+select+"]번을 선택했습니다.");
					isRightInput = true;
				}
			} catch (NumberFormatException e) {
				view.line();
				System.out.println("<WrongInput!!!> 0~3의 정수를 입력해주세요!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return select;
	}

	public static void main(String[] args) {
		Main client = new Main();
		boolean isExit = false;
		client.selectFile(); //파일 이름 설정

		while(!isExit) {
			int clientChoice = client.selectMenu();
			switch(clientChoice) {
			case Request.LOTTO_NORMAL:
				client.view.line();
				client.handler.serviceMenu1();
				break;
			case Request.LOTTO_MULTI:
				client.view.line();
				client.handler.serviceMenu2();
				break;
			case Request.LOTTO_RATE:
				client.handler.serviceMenu3();
				break;
			case Request.EXIT:
				System.out.println("#####프로그램을 종료합니다#####");
				isExit = true;
				break;
			}//switch
		}//while
	}//main
}//class
