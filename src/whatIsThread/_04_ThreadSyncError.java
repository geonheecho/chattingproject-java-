package whatIsThread;

/* 현재 이 프로그램은 3개의 쓰레드가 동작하고 있다.
 * 쓰레드에서는 Increment의 객체를 공유하고 있다
 * run에서는 Increment()가 호출되는 중에 다른 쓰레드로
 * 컨텍스트 스위칭(Context Switching)이 일어나게 된다
 * 쓰레드가 많아질수록 and 연산회수가 많아질수록
 * 잘못된 연산이 일어날 확률이 매우 높아진다.
 * 
 * num++
 * Java -> Assembly Code로 변환되어서 실행된다
 * Thread는 이 3단계 중에 언제든지 다른 쓰레드로 제어권이 넘어 갈 수 있다.
 * 1) CPU내의 register에 num메모리 값을 복사한다
 * 2) CPU에서는 ++연산자의 명령을 해석해 num을 1증가 결과값을 
 *    register의 다른 메모리에 저장한다
 * 3) register의 결과값을 num에 복사한다.
 * */
class Increment{
	int num=0;
//	public void doIncrement() {num++;}
	public synchronized void doIncrement() {num++;}
	public int getNum() {return num;}
}

class IncThread extends Thread{
	Increment inc;
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	public void run() {
		for(int i=0;i<10000;i++)
			inc.doIncrement();
	}
}
public class _04_ThreadSyncError {
	public static void main(String[] args) {
		Increment inc = new Increment();
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		it1.start();
		it2.start();
		it3.start();
		try {
			it1.join();
			it2.join();
			it3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(inc.getNum());
	}
}
