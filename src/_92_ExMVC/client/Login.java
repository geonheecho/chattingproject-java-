package _92_ExMVC.client;

//사용자가 로그인을 요청(Request)했을 때 서버에 들어가는 데이터 모음이라고 생각하자(자바 객체X) : JSON, XML
public class Login {
	public String typedUsername;
	public String typedPassword;
	
	public Login(String typedUsername, String typedPassword){
		this.typedUsername = typedUsername;
		this.typedPassword = typedPassword;
	}
}
