package whatIsThread;

class Sum2{
	int num;
	Sum2(){num=0;}
	void addNum(int n) { num += n; }
	int getNum() { return num;}
}
class AdderThread2 extends Thread{
	Sum2 sumInst;
	int start, end;
	AdderThread2(Sum2 sum, int s, int e){
		sumInst = sum;
		start = s;
		end = e;
	}
	public void run() {
		for(int i=start;i<=end;i++)
			sumInst.addNum(i);
	}
}
public class _03_ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum2 s = new Sum2();
		AdderThread2 at1 = new AdderThread2(s, 1, 50);
		AdderThread2 at2 = new AdderThread2(s, 51, 100);
		at1.start();
		at2.start();
		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합: " + s.getNum());
	}
}