package _91_quizProject;

public class QuizService {
	Repository database;
	Setting setting = new Setting();
	Page view = new Page();
	Utility util = new Utility();
	Input keyboard = new Input();
	

	QuizService(String inputFileName){
		database = new Repository(inputFileName);
	}

	public void launchWelcomeUntilTeamSetting(){
		boolean isContinued = false;
		while(!isContinued) {
			view.showWelcomeAndSetTeamPage();
			util.selectContinueOrTerminate();
			view.selectTeamPage();
			if(setting.selectTeam()==0) {
				view.showBackMsg();
			}else {
				isContinued = true;
				break;
			}
		}
	}

	public void launchMemberSetting() {
		boolean isContinued = false;
		while(!isContinued) {
			view.showSetMemberPage(Setting.getTeam());
			util.selectContinueOrTerminate();
			view.selectMemberPage();
			if(setting.selectMember().equals("0")) {
				view.showBackMsg();
			}else {
				isContinued = true;
				break;
			}
		}
	}

	public void launchCompleteSetting() {
		setting.createRandomListOfMember();
		view.completeSetTeamAndMemberPage(Setting.getTeam(), Setting.getMember(), Setting.getRandomListOfMember());
		util.selectContinueOrResetSetting();
	}

	public void launchLimitTimeSetting() {
		boolean isContinued = false;
		while(!isContinued) {
			view.showSetLimitTimePage();
			if(keyboard.inputOnlyEnterOrZero().equals("0")) {
				view.showChangeLimitTimePlay();
				if(setting.selectLimitTime()==0) {
					view.showBackMsg();
				}else {
					isContinued = true;
					break;
				}
			}else {
				Setting.limitTime = Setting.DEFAULT_LIMIT_TIME;
				isContinued = true;
				break;
			}
		}
	}
	
	public void launchGameInstructionPage() {
		view.showGameInstruction(Setting.limitTime, database.getQuestionSet().size());
		util.selectContinueOrTerminate();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

	}
}