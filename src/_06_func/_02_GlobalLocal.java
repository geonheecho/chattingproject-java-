package _06_func;

public class _02_GlobalLocal {
	//전역 변수와 지역 변수

	int globalVar = 100; //Global Variable : 글로벌 변수(전역 변수)
	void function() {
		int localVar = globalVar; //Local Variable : 로컬 변수(지역 변수)
		System.out.println(localVar);
	}
	void another() {
		System.out.println(globalVar);
		//System.out.println(localVar);//Error
	}
}
