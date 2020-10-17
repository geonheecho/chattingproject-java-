package _91_quizQuickStart;

public class Main extends Thread{
	GameService service;
	Page view = new Page();
	Input keyboard = new Input();
	static int LIMIT_TIME = 30;
	
	Main(){
		service = new GameService();
	}
	
	void launchProgram() {
		service.progressWelcomeAndTeamSetting();
		start();
		service.PlayGame();
		view.showTerminateMsg();
	}
	
	public void run() {
//		System.out.println("카운트 시작");
		while(LIMIT_TIME != 0) {
			try {
				Thread.sleep(1000);
				LIMIT_TIME--;
			}catch(InterruptedException ie) {
				System.out.println(ie);
			}
		}
		view.showGameOverMsg();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.launchProgram();
	}
}
