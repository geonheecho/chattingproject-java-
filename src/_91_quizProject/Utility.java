package _91_quizProject;

public class Utility {
	Input keyboard = new Input();
	Page view = new Page();


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

	void selectContinueOrResetSetting() {
		while(true) {
			String select = keyboard.inputOnlyEnterOrZero();
			if(select.equals("0")) {
				Setting.resetSetting();
				view.showResetMsg();
				Main.isResetSetting = false;
				break;
			}else {
				Main.isResetSetting = true;
				break;
			}
		}
	}


}//class