package _91_quizProject;

import java.util.ArrayList;
import java.util.Random;

public class Setting {
	Input keyboard = new Input();
	Page view = new Page();
	private static ArrayList<String> member = new ArrayList<String>();
	private static ArrayList<String> randomListOfMember = new ArrayList<String>();
	private static int team;
	static final int DEFAULT_LIMIT_TIME = 1;
	static int limitTime;

	Setting(){
	}

	int selectTeam() {
		int result = 0;
		while(true) {
			int num = keyboard.inputInteger();
			if(num>0 && num<5) {
				team = num;
				result = team;
				break;
			}else if(num==0) {
				result = num;
				break;
			}else {
				System.out.println("선택 할 수 있는 팀은 1~6팀 입니다.");
			}
		}
		return result;
	}

	String selectMember(){
		for(int i=0; i<6; i++) {
			String name = keyboard.inputString();
			if(name!="0") {
				member.add(name);
			}
			if(name.equals("0")) {
				member.clear();
				return "0";
			}
		}
		return "1";
	}

	void createRandomListOfMember() {
		Random random = new Random(); 
		for(int i=0; i<member.size(); i++) {
			int idx = random.nextInt(member.size());
			randomListOfMember.add(member.get(idx));
			if(i != 0) {
				for(int j=0; j<i; j++) {
					if(randomListOfMember.get(j)==randomListOfMember.get(i)) {
						randomListOfMember.remove(i);
						i--;
						break;
					}
				}
			}
		}
	}
	
	void checkLimiTime() {
	}
	
	int selectLimitTime() {
		boolean isSelected = false;
		int result = 0;
		while(!isSelected) {
			result = keyboard.inputInteger();
			if(result == 0) {
				limitTime = DEFAULT_LIMIT_TIME;
				isSelected = true;
				break;
			}else if(result>0 && result<6) {
				limitTime = result;
				isSelected = true;
				break;
			}else {
				view.showWrongInputMsg();
			}
		}
		return result; //0~6 반환
	}

	public static void resetSetting() {
		member.clear();
		randomListOfMember.clear();
		team = 0;
	}

	public static ArrayList<String> getMember() {
		return member;
	}

	public static ArrayList<String> getRandomListOfMember() {
		return randomListOfMember;
	}

	public static int getTeam() {
		return team;
	}

}//class
