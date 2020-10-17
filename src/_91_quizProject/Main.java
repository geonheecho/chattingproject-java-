package _91_quizProject;

public class Main {
	Input keyboard = new Input();
	Page view = new Page();
	String inputFileName = "";
	QuizService service;
	Utility util = new Utility();
	Setting setting = new Setting();
	static boolean isResetSetting = false;

	Main(){
		view.showSetFilePage();
		selectFile();
		service = new QuizService(inputFileName);
	}

	void selectFile(){
		String inputFileName = keyboard.inputString();
		this.inputFileName = inputFileName;
	}

	void mainProgram() {
		while(!isResetSetting) {
			service.launchWelcomeUntilTeamSetting();
			service.launchMemberSetting();
			service.launchCompleteSetting();
		}
		service.launchLimitTimeSetting();
		service.launchGameInstructionPage();
	}


	public static void main(String[] args) {
		Main main = new Main();
		main.mainProgram();
	}
}
