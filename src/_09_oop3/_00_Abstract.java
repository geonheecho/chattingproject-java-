package _09_oop3;
/*
 * abstract가 붙여진 추상클래스가 설사 모두 구현된 것이라고 해도 인스턴스화를 할 수 없다.
 * 단, 클래스 안에 abstract가 붙여진 추상메서드가 있다면 반드시 abstract class로 정의를 해야한다.
 */
abstract class Factory{
	private String name; //공장 이름
	private String location; //공장 위치
	private String product; //생산 제품
	private int equipment_num; //설비 개수
	private boolean isOperated = false; //공장 가동 여부

	Factory(String name, String location, String product, int equipment_num){
		this.name = name;
		this.location = location;
		this.product = product;
		this.equipment_num = equipment_num;
	}
	
	protected void start() {
		this.isOperated = true;
	}
	
	protected void stop() {
		this.isOperated = false;
	}
	
	protected boolean isStart() {
		return this.isOperated;
	}
	
	//추상메서드
	protected abstract void state();
}

class SnackFactory extends Factory{

	SnackFactory(String name, String location, String product, int equipment_num) {
		super(name, location, product, equipment_num);
	}
	
	//오버라이드 단축키 : ALT+SHIFT+S+V
	@Override
	protected void state() {
		if(isStart()) {
			System.out.println("과자 생산 중");
		}else {
			System.out.println("과자 생산 중단됨");
		}
	}

	/*
	 * 추상클래스에서 상속받은 속성 및 기능뿐만아니라
	 * 새롭게 선언도 가능함
	 */
	
	public void factoryInfo() {
		System.out.println("과자 공장입나다.");
//		System.out.println(name); // Error
	/*
	 * 접근제한자로 인해 은닉이 되었기 때문에 사용이 불가능하다.
	 * 바람직했던 방법은 구현클래스에서 이 메서드를 만드는 것이 아니라
	 * 추상크래스에서 미리 만들어 놓는 것일 것이다.
	 */
	}
}

//추상클래스
public class _00_Abstract {
	public static void main(String[] args) {
//		Factory absObj = new Factory("과자공장", "서울", "과자", 10); //Error
		//추상클래스는 인스턴스화가 불가능 하다.
		SnackFactory factory = new SnackFactory("과자", "서울", "과자", 10);
		factory.state();
		factory.start();
		factory.state();
		factory.stop();
		factory.state();
		factory.factoryInfo();
	}
}
