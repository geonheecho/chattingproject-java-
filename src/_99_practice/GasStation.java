package _99_practice;

class Car {
	public int gas;
}
class Truck extends Car{
}
class Suv extends Car{
}
class Bus extends Car{
}

public class GasStation {
//	public void fill(Suv suv) {
//		System.out.println("Suv에 기름을 넣습니다");
//		suv.gas +=10;
//		System.out.println("기름이 "+suv.gas+"리터 들어있습니다.");
//	}
//	
//	public void fill(Truck truck) {
//		System.out.println("Truck에 기름을 넣습니다");
//		truck.gas +=10;
//		System.out.println("기름이 "+truck.gas+"리터 들어있습니다.");
//	}
//	
//	public void fill(Bus bus) {
//		System.out.println("Bus에 기름을 넣습니다");
//		bus.gas +=10;
//		System.out.println("기름이 "+bus.gas+"리터 들어있습니다.");
//	}
	
	public void fill(Car car) {
		System.out.println(car.getClass().getName()+ "에 기름을 넣습니다");
		car.gas+=10;
		System.out.println("기름이 "+car.gas+"리터 들어있습니다.");
	}
	
	public static void main(String[] args) {
		GasStation gasStation = new GasStation();
		Suv suv = new Suv();
		Truck truck = new Truck();
		Bus bus = new Bus();
		
		gasStation.fill(suv);
		gasStation.fill(truck);
		gasStation.fill(bus);
		System.out.println("==================");
	}
}
