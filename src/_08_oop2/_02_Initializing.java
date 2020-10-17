package _08_oop2;

class Init{
	int num;
	static String str;
	
	//인스턴스 초기화
	{
		System.out.println("인스터스 초기화 호출");
		num = 10;
	}
	
	//클래스 초기화
	static {
		System.out.println("클래스 초기화 호출");
		str = "Java";
	}
	
	Init(){
		System.out.println("생성자 호출");
	}
	
	public void info() {
		System.out.println("num : "+num);
		System.out.println("str : "+str);
	}
	public static void info2() {
		System.out.println("str : "+str);
	}
}

public class _02_Initializing {
	public static void main(String[] args) {
	Init obj = new Init();
 	Init.info2();
	System.out.println("==================");
	obj.info();
	}
}
