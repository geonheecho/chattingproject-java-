package _99_practice;

public class Member {
	String id;
	String nickname;
	private String password;
	
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	
	public String getPassword(String check) {
		if(id.equals(check)) {
			return password;
		}else {
			return null;
		}
	}
}
