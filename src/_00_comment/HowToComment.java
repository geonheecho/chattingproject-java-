package _00_comment;
//라인주석 [ctrl + /]

/*
 * 블럭주석 [ctrl+shift+/] - 해제 [ctrl+shift+\]
 */

/**
 * javadoc api 문서 [alt+shift+j]
 * @author dlals
 *
 */

/*
 *  \n 개행 . 스크린 커서 위치를 다음줄의 처음으로 옮기 10
     \t 수평탭. 스크린 커서를 다음 탭으로 옮김
     \r 캐리지리턴. 스크린커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지 않는다.
             이 기호 다음에 오는 문자를 덮어 쒸운다. 13
     \\ : 역슬래시 문자를 출력할때 사용.
     \" : 큰 따옴표를 출력할때 사용
     \' : 작은 따옴표를 출력할때 사용
 */

public class HowToComment {
	public static void main(String[] args) {

		System.out.println("\\"); 
		System.out.println("Hello Java\r123");
		System.out.println("Rhie\"\'");

	}
}
