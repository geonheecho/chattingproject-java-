package _91_quizQuickStart;


public class Page {
	public void showDivisionLine() {
		System.out.println("-------------------------------------------------------------------------");
	}

	public void showSetFilePage(String defaultFileName) {//
		System.out.println(" 설정된 기본 파일은 "+defaultFileName+"*입니다.");
		System.out.println(" 파일을 변경하고 싶다면 새로운* 파일을 입력해주세요.([Enter]를 누를 시 기본 파일로 설정됩니다)");

	}

	public void completeSetFilePage(String inputFileName) {//
		showDivisionLine();
		System.out.println(" ※["+inputFileName+"] 파일 경로 설정 완료");
	}

	public void showWelcomeAndSetTeamPage() {//
		showDivisionLine();
		System.out.println(" \"QuizPlay에 오신 것을 환영합니다.\"");
		System.out.println(" \"팀을 설정해주세요.(1~6팀)\"");
	}
	
	public void showGameStartMsg(int team) {
		showDivisionLine();
		System.out.println(" "+team+"팀을 선택하셨습니다.");
		System.out.println(" 게임을 시작해주세요.");
		System.out.println(" [Enter]: 게임시작");
	}
	
	public void showGetReadyMsg() {
		showDivisionLine();
		System.out.println(" 10초 후 게임이 시작됩니다.");
		System.out.println(" 준비해주세요");
	}
	
	public void showQuestion(int countQuestion, String question, int questionScore) {
		showDivisionLine();
		System.out.println(" "+(countQuestion+1)+"번째 문제("+questionScore+"점): "+question);
		System.out.println(" [Enter]: 정답  [0]: 패스");
	}

	public void showQuestionCorrectMsg(int questionScore) {
		showDivisionLine();
		System.out.println(" \"정답이에요!!! "+questionScore+"점 획득했어요!\"");
	}
	public void showQuestionPassMsg() {
		showDivisionLine();
		System.out.println(" \"패스!!!! 이런... 분발해야겠어요!\"");
	}
	
	public void showGameOverMsg() {
		System.out.println();
		System.out.println("-----------------------------GAME OVER-----------------------------");
		System.out.println(" 진행 중이던 문제는 무효처리 됩니다.");
	}
	
	public void showInvalidMsg() {
		System.out.println(" 시간이 경과되어 무효...!!");
	}
	
	public void showResults(int totalQuestions, int countQuestions, int totalCorrects, int totalScore) {
		showDivisionLine();
		System.out.println("  < 결과 >");
		System.out.println(" [총 문제 갯수]: "+totalQuestions);
		System.out.println(" [진행한 문제 갯수]: "+countQuestions);
		System.out.println(" [총 맞힌 갯수]: "+totalCorrects);
		System.out.println(" [총 점수]: "+totalScore);
	}
	
	public void showGameContinueMsg() {
		System.out.println(" 게임을 다시 실행 하시겠습니까?");
		System.out.println(" [Enter]: 재시작  [0]: 프로그램 종료");
	}

	public void showTerminateMsg() {
		showDivisionLine();
		System.out.println(" \"*QuizPlay*를 이용해 주셔서 감사합니다.\"");
		System.out.println(" >>>>>>>>>>>>>>>>>>프로그램종료>>>>>>>>>>>>>>>>>>");
	}

	public void showWrongInputMsg() {
		System.out.println(" <!!!WrongInput!!!> 다시 입력해주세요.");
	}

	public void showFileNotFoundMsg(String inputFileName) {
		showDivisionLine();
		System.out.println(" ※ 파일 경로 설정 실패<!>");
		System.out.println(" ["+inputFileName+"] 파일을 찾을 수 없습니다.");
		System.out.println(" 파일 확인 후 다시 실행해주세요.");
	}

	
}
