package _92_ExMVC.DBMS;

public class UserSchema {
	private String username; //아이디
	private String password; //비밀번호
	private int age; //나이
	
	public String getUsername() {
		return username;
	}
	public UserSchema setUsername(String username) {
		this.username = username;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public UserSchema setPassword(String password) {
		this.password = password;
		return this;
	}
	public int getAge() {
		return age;
	}
	public UserSchema setAge(int age) {
		this.age = age;
		return this;
	}
	
	
	
}
