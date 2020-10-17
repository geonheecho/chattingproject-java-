package _11_useful_class_string;

class UnOverrideClass{
	
}

class OverrideClass{

	@Override
	public int hashCode() {
		return 10;
	}
	
}

public class StringEx {
	public static void main(String[] args) {
		//String은 immutable 하기 때문에
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		System.out.println("str1의 주소값 : "+ System.identityHashCode(str1));
		System.out.println("str2의 주소값 : "+ System.identityHashCode(str2));
		
		String strA = new String ("Hello");
		String strB = new String ("Hello");
		System.out.println(strA == strB);
		System.out.println("strA의 주소값 : "+ System.identityHashCode(strA));
		System.out.println("strB의 주소값 : "+ System.identityHashCode(strB));
		
		//왜 java.lang.Object의 hashCode()를 안쓰고 System기능을 썼는가?
		//이유는 java.lang.Object의 hashCode()가 오버라이딩 될 수도 있기 때문이다.
		//비록 Object.hashCode()와 System.identityHashCode()가 기본적으로 같지만,
		UnOverrideClass obj1 = new UnOverrideClass();
		UnOverrideClass obj2 = new UnOverrideClass();
		System.out.println("obj1의 주소값 : "+ System.identityHashCode(obj1));
		System.out.println("obj2의 주소값 : "+ System.identityHashCode(obj2));
		System.out.println("obj1의 해쉬값 : "+ obj1.hashCode());
		System.out.println("obj2의 해쉬값 : "+ obj2.hashCode());
	
		//그러나 hashCode()가 오버라이딩 되었다면?
		OverrideClass objA = new OverrideClass();
		OverrideClass objB = new OverrideClass();
		System.out.println("objA의 주소값 : "+ System.identityHashCode(objA));
		System.out.println("objB의 주소값 : "+ System.identityHashCode(objB));
		System.out.println("objA의 해쉬값 : "+ objA.hashCode());
		System.out.println("objB의 해쉬값 : "+ objB.hashCode());
		
		//String의 hashCode()는 오바라이딩 되어있다.
		//String의 해쉬값이 곧 주소값을 의미하지 않는다.
		System.out.println("strA의 해쉬값 : "+ strA.hashCode());
		System.out.println("strB의 해쉬값 : "+ strB.hashCode());
	}
}
