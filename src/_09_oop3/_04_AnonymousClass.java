package _09_oop3;

interface MyCal{
	public abstract int cal(int n1, int n2);
}

class MyAdd implements MyCal{

	@Override
	public int cal(int n1, int n2) {
		return n1+n2;
	}
}

class MySub implements MyCal{

	@Override
	public int cal(int n1, int n2) {
		return n1 - n2;
	}
}

abstract class MyMulAnd implements MyCal{

	@Override
	public int cal(int n1, int n2) {
		return n1*n2;
	}

	public abstract double div(int n1, int n2);
}

class MyMulAndDiv extends MyMulAnd{

	@Override
	public double div(int n1, int n2) {
		return n1/n2;
	}
}

public class _04_AnonymousClass {
	public static void main(String[] args) {
		MyAdd add = new MyAdd();
		System.out.println(add.cal(10, 20));
		MySub sub = new MySub();
		System.out.println(sub.cal(5, 10));
		MyMulAndDiv md = new MyMulAndDiv();
		System.out.println(md.cal(100, 7));
		System.out.println(md.div(100, 7));
		System.out.println("===============");
		System.out.println(new MyCal() {
			@Override
			public int cal(int n1, int n2) {
				return n1+n2*10;
			}
		}.cal(10, 20));
		int result = new MyCal() {
			@Override
			public int cal(int n1, int n2) {
				return n1-n2*10;
			}
		}.cal(5, 10);
		System.out.println(result);
		MyMulAnd mulDiv=new MyMulAnd() {
			@Override
			public double div(int n1, int n2) {
				return n1/n2;
			}
		};
		System.out.println(mulDiv.cal(10, 20));
		System.out.println(mulDiv.div(10, 20));
		System.out.println("===============");
		System.out.println(new MyCal() {
			@Override
			public int cal(int n1, int n2) {
				return n1+n2;
			}	
		}.cal(10, 20));
		System.out.println(new MyCal() {
			@Override
			public int cal(int n1, int n2) {
				return n1-n2;
			}
		}.cal(10, 20));
		System.out.println(new MyCal() {
			@Override
			public int cal(int n1, int n2) {
				return n1*n2;
			}
		}.cal(10, 20));
	System.out.println(new MyCal() {
		@Override
		public int cal(int n1, int n2) {
			return n1/n2;
		}
	}.cal(10, 5));
	}
}
