package _11_useful_class.object;

import java.lang.reflect.Method;
import java.util.Arrays;

class Something{
	int a = 10;
	String b = "ABC";
	
	public void c() {
		System.out.println("ccc");
	}
	
	public void b() {
		System.out.println("bbb");
	}
}

public class _03_ObjectEx4 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//Heap에 객체가 생성되는 과정
		//ClassLoader가 특정 클래스를 불러온다.
		Class clazz = Something.class;
		//불러온 클래스의 정보를 바탕으로 객체를 만든다.
		Something som = (Something)clazz.newInstance();
		
		//위 과정을 축소하면 아래와 같다.
		Something s = new Something();
		
		//즉, getClass()는 특정 객체의 Class 정보를 볼 수 있도록 Class 객체를 return 한다.
		//ex) example 클래스에 있는 메서드들 보기
		Method[] m = s.getClass().getDeclaredMethods();
		System.out.println("선언된 메서드 개수 : "+ m.length);
		System.out.println("메서드 내용");
//		for(int i = 0; i<m.length; i++) {
//			System.out.println(m[i]);
//		}
		
		//foreach
		for(Method e : m) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.deepToString(m));
	}
}
