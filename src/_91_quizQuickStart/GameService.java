package _91_quizQuickStart;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class GameService {
	Repository dB;
	FileWriter fw;
	PrintWriter pw;
	Random random = new Random(); //지역변수로 설정 가능
	Page view = new Page();
	Input keyboard = new Input();
	ArrayList<String> changedList = new ArrayList<String>();
	int team;

	GameService(){
		dB = new Repository();
	}

	void progressWelcomeAndTeamSetting() {
		view.showWelcomeAndSetTeamPage();
		while(true) {
			int select = keyboard.inputInteger();
			if(select>0 && select<7) {
				team = select;
				break;
			}else {
				view.showWrongInputMsg();
			}
		}
		
		view.showGameStartMsg(team);
		view.showGetReadyMsg();
		
	}

	void PlayGame() {
		boolean isGameOver = false;
		final int SCORE = 3;
		int countQuestions = 0; //
		int totalScore = 0; //
		int totalCorrects = 0; //
		while(!isGameOver) {
			if(dB.getQuestionList().size()>0) {
				int idx = random.nextInt(dB.getQuestionList().size());
				int questionScore = random.nextInt(SCORE)+1;
				String question = dB.getQuestionList().get(idx);
				view.showQuestion(countQuestions, question, questionScore);
				String select = keyboard.inputOnlyEnterOrZero();
				if(Main.LIMIT_TIME == 0) {
					view.showInvalidMsg();
					isGameOver = true;
					break;
				}
				if(select.equals("")) {
					view.showQuestionCorrectMsg(questionScore);
					totalCorrects++;
					totalScore += questionScore;
					changedList.add(question);
					dB.getQuestionList().remove(idx);
				}else {
					view.showQuestionPassMsg();
				}
				countQuestions++;	
			}else {
				isGameOver = true;
				break;
			}
		}//while
		view.showResults(dB.getQuestionSet().size(), countQuestions, totalCorrects, totalScore);
		//changeInitFile(dB.getInputFileName());
	}
	
	void changeInitFile(String inputFileName) {
		try {
			fw = new FileWriter(inputFileName, false);
			pw = new PrintWriter(fw, true);
			for(String item : changedList) pw.println(item);
			pw.flush();
			changedList.clear();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	void selectContinueOrTerminate() {
		boolean flag = false;
		while(!flag) {
			String select = keyboard.inputOnlyEnterOrZero();
			if(select.equals("0")) {
				view.showTerminateMsg();
				System.exit(0); //프로그램 종료
			}else {
				flag = true;
				break;
			}
		}
	}
}
