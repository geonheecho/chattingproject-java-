package _08_oop2;

class Member {
	//캡슐화 : 회원정보와 관련된 속성을 정의하였다.
	//				그리고 접근제한자를 이용한 정보 은닉으로 제어성을 높였다 
	private String username;
	private String password;

	//캡슐화 : 그리고 속성들을 제어한 Method 들을 정의하였다.(getter/setter)
	// getter/setter 자동완성 단축키 : ALT +SHIFT + S + R
	Member(String username, String password){
		this.username = username;
		this.password = password;
	}

	//ID는 한번 정해지면 바뀌질 않으므로 setter가 빠져있다.
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	
	public void printInfo() {
		System.out.println("아이디 : " + username);
		System.out.println("비밀번호 : " + password);
	}
}

public class _06_Encapsulation{
	public static void main(String[] args) {
		Member mem = new Member("JavaKing","1234");
		mem.printInfo();
		mem.setPassword("4321");
		mem.printInfo();
		//username을 바꿀 수 있는 방법이 없다. 속성이 private으로 되어 있을 뿐더러
		//속성을 변경할 수 있는 method 조차 만들어져 있지 않다.
	}
}
