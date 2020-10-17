package whatIsThread;

class Sum{
	int num;
	Sum(){num=0;}
	void addNum(int n) { num += n; }
	int getNum() { return num; }
}
/*Thread를 만드는 2번째 방법
 * 1) 이미 다른 클래스의 상속을 받은 클래스는 Thread의 상속을 
 *   받을 수 없다(java는 단일 상속만 가능하기 때문에)
 * 2) 이럴 때는 Runnable 인터페이스의 상속을 받는다
 * 3) 그리고 run()메서드를 구현한다.
 * 4) Thread클래스의 객체를 만들어 생성자의 인자로
 *   Runnable을 상속받은 객체를 넣어준다.
 * 5) start()를 호출하면 run()이 동작한다*/
class AdderThread extends Sum implements Runnable{
	int start, end;
	AdderThread(int s, int e){
		start = s;
		end = e;
	}
	public void run(){
		for(int i=start;i<=end;i++) {
			System.out.println(i + "값 누적 반복");
			addNum(i);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}

public class _02_RunnableThread {
	public static void main(String[] args) {
		System.out.println("main쓰레드 시작");
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		t1.start();
		t2.start();
		
		try {
			// main쓰레드는 t1, t2가 끝날 때까지 대기 상태 
			t1.join();// 나 너 끝날때까지 기다릴께 같이가(join)
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합: " + 
						(at1.getNum() + at2.getNum()));
		System.out.println("main쓰레드 종료");
	}
}
