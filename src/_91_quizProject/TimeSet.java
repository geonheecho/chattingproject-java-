package _91_quizProject;

public class TimeSet extends Thread{
	int timeCount;
	Input input = new Input();

	TimeSet(){
		timeCount = 15;
		start();
//		try {
//			join();
//		} catch (InterruptedException e) {
//		}
	} 

	public void run() {
		try {
			boolean isTimeOver = false;
			while(!isTimeOver) {
//				System.out.println(timeCount);
				if(timeCount == 0) {
					isTimeOver = true;
					break;
				}
				Thread.sleep(1000);
				timeCount--;
			}
		}catch(InterruptedException ie) {}
		System.out.println();
		System.out.println("%%%%%%%%run() 끝%%%%%%%");
	}


	//0 = ++ , "" = pass
	public void m1() {
		boolean flag = false;
		int totalCorrect = 0;
		while(!flag) {
			String question = "문제";
			String result = "";
			if(timeCount != 0) {
			System.out.println(question);
			result = input.inputString();
			System.out.println(result+1000000);
			}
			if(timeCount == 0) break;
			if(result.equals(question)){
				totalCorrect++;
			}
		}
		System.out.println("m1() 끝");
		System.out.println("총 맞힌 문제: "+totalCorrect);
	}

	public static void main(String[] args) {
		TimeSet ts = new TimeSet();
		ts.m1();
		System.out.println("main 끝");
	}
}