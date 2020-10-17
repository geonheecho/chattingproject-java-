package _15_generic2;

interface Eatable{};
interface Delicious{};
abstract class Cookbook{}
class Food{}
//class Food implements Eatable{}
class Fruit{}

//원래 인터페이스를 상속(구현)할 때 implements를 써야하는데 그냥 extends 로 통일
//class Example<T extends Food & Fruit>{} 구현 클래스 & 구현 클래스 : no
//class Example<T extends Food & Cookbook>{} 구현 클래스 & 추상 클래스 : no
//class Example<T extends Food & Cookbook & Eatable>{} 구현 클래스 & 추상 클래스 & 인터페이스 : no
class Example<T extends Food & Eatable & Delicious>{} //구현 클래스 & 인터페이스 ...


public class _04_GenericExtends {

}
