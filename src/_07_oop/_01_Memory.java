package _07_oop;

/*
 * Stack-Heap-Class
 * Stack = 선입호출 구조, 작은 메모리 영역
 * Heap = 큰 메모리 영역
 * 	기본형과 참조형 변수는 Stack에 쌓이고
 * 	기본형이라면 Stack에 실제 값이...
 * 	참조형이라면 Heap에 실제 값이 존재
 * 	(기본형 : Primitive Type, 참조형 : Reference Type)
 *
 * 	Stack에 있는 참조형의 값은 주소값이다. 이 주소값을 통해 실제의 값이 있는 곳(Heap)을 가리키게 된다.
 * 
 * Class = Class 메모리 영역은 Method Area, Static Area 등으로도 불린다.
 * 			그리고 크게 Method영역과 Static영역, 그리고 상수풀(Constant Pool)로 나뉜다.
 * 			
 * 			Static으로 선언됨 --> Static 영역
 * 			Static으로 선언 안됨 --> Method 영역
 * 			final과 같은 상수 --> 상수풀
 * 
 */


public class _01_Memory {

}
