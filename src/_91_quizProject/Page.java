package _91_quizProject;

import java.util.ArrayList;

public class Page {
	public void showDivisionLine() {
		System.out.println("-------------------------------------------------------------------------");
	}

	public void showSetFilePage() {//
		System.out.println(" 프로그램을 실행하기 위해 사용될 파일을 설정해야합니다.");
		System.out.println(" 프로그램에 설정된 기본 파일은 datas.txt*입니다.");
		System.out.println(" 파일을 변경하고 싶다면 새로운* 파일을 입력해주세요.([Enter]를 누를 시 기본 파일로 설정됩니다)");

	}

	public void completeSetFilePage(String inputFileName) {//
		showDivisionLine();
		System.out.println(" ※["+inputFileName+"] 파일 경로 설정 완료");
	}

	public void showWelcomeAndSetTeamPage() {//
		showDivisionLine();
		System.out.println(" \"QuizPlay에 오신 것을 환영합니다.\"");
		System.out.println(" \"게임을 시작하기 전에 팀*과 팀원*을 입력해야합니다.\"");
		System.out.println(" [Enter]: 계속하기  [0]: 프로그램 종료");
	}

	public void selectTeamPage() {//
		showDivisionLine();
		System.out.println(" 1~6팀을 선택해주세요 (총 6팀)");
		System.out.println(" [0]: 뒤로가기");
	}

	public void showSetMemberPage(int team) {//
		showDivisionLine();
		System.out.println(" \""+team+"팀*을 선택하셨습니다.\"");
		System.out.println(" \"함께할 팀원을 입력해야 합니다.\"");
		System.out.println(" \"팀원을 설정하면 무작위*로 도전자 순서*가 결정됩니다.\"");
		System.out.println(" [Enter]: 계속하기  [0]: 프로그램 종료");
	}

	public void selectMemberPage() {//
		showDivisionLine();
		System.out.println(" 6명의 팀원 이름을 설정해주세요 (총 6명)");
		System.out.println(" [0]: 뒤로가기");
	}

	public void completeSetTeamAndMemberPage(int team, ArrayList<String> member, ArrayList<String> randomListOfMember) {//
		showDivisionLine();
		System.out.println(" \""+team+"팀의 "+member.toString()+" 팀원들이\n 결성되었습니다.\"");
		System.out.println(" \"이제 게임을 시작할 준비가 되었습니다.\"");
		System.out.println(" 순서 :");
		for(int i=0; i<randomListOfMember.size(); i++) System.out.println(" "+(i+1)+"번째 도전자 : "+randomListOfMember.get(i));
		System.out.println(" \"계속하시면 팀 변경*이 불가능* 합니다.\"");
		System.out.println(" [Enter]: 계속하기  [0]: 팀 설정 다시하기");
	}
	public void showSetLimitTimePage() { //1
		showDivisionLine();
		System.out.println(" \"게임 제한시간을 설정 할 수 있습니다.\"");
		System.out.println(" \"기본설정 제한시간은 1분*입니다.\"");
		System.out.println(" \"제한시간을 변경* 할 수 있습니다.\"");
		System.out.println(" [Enter]: 기본으로 진행 [0]: 변경하기");
	}
	
	public void showChangeLimitTimePlay() { //2-1
		showDivisionLine();
		System.out.println(" 변경할 제한시간을 설정해주세요. (최대 5분)");
		System.out.println(" [0]: 뒤로가기");
	}

	public void showGameInstruction(int limitTime, int totalQuestion) { //2-2
		showDivisionLine();
		System.out.println(" 게임설명 :");
		System.out.println(" - 게임 플레이 중에는 프로그램을 종료 할 수 없습니다.");
		System.out.println(" - 제한시간은 "+limitTime+"*분 입니다.");
		System.out.println(" - 총 문제 갯수: "+totalQuestion+"개");
		System.out.println(" - 조작키 = [Enter]: CORRECT  [0]: PASS");
		System.out.println(" [Enter]: 게임시작 [0]: 프로그램 종료");
	}
	
	public void selectChoiceOfTerminationPage() {
		showDivisionLine();
		System.out.println(" 정말로 종료하시겠습니까?");
		System.out.println(" [Entre]: 네  [0]: 아니오");
	}

	public void showTerminateMsg() {
		showDivisionLine();
		System.out.println(" ※ 맞힌 문제를 제외한 나머지를 실행파일에 저장 완료");
		System.out.println(" \"*QuizPlay*를 이용해 주셔서 감사합니다.\"");
		System.out.println(" >>>>>>>>>>>>>>>>>>프로그램종료>>>>>>>>>>>>>>>>>>");
	}

	public void showWrongInputMsg() {
		System.out.println(" <!!!WrongInput!!!> 다시 입력해주세요.");
	}

	public void showFileNotFoundMsg() {
		showDivisionLine();
		System.out.println(" 해당 파일이 존재하지 않습니다. ");
		System.out.println(" 프로그램을 실행 할 수 없습니다.");
		System.out.println(" 파일 확인 후 다시 실행해주세요.");
	}
	
	public void showBackMsg() {
		showDivisionLine();
		System.out.println(" 뒤로가기를 선택하셨습니다.");
		System.out.println(" ※ 이전 페이지 다시 실행");
	}
	public void showResetMsg() {
		showDivisionLine();
		System.out.println(" 팀 설정 다시하기를 선택하셨습니다.");
		System.out.println(" ※ 초기 페이지 다시 실행");
	}


	
}
