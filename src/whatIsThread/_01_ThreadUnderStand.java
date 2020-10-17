package whatIsThread;

/*  Thread만드는 1번째 방법
 * 1) Thread 상속을 받는 클래스를 만든다
 * 2) run메서드에 동작하고 싶은 기능을 구현한다.
 *    (알바생에게 시키고 싶은 일)
 * 3) 쓰레드 객체의 start() 메서드를 호출한다.
 * 4) run메서드가 동작한다.
 */
class ShowThread extends Thread{
	String threadName;
	ShowThread(String name){
		threadName = name;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("안녕하세요. " 
							+ threadName + "입니다.");
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _01_ThreadUnderStand {
	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("알바A 쓰레드");
		ShowThread st2 = new ShowThread("알바B 쓰레드");
		st1.start();
		st2.start();
	}
}
