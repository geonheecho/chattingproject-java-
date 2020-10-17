package _92_ExMVC.server;

import _92_ExMVC.DBMS.UserSchema;

public class UserEntity implements Entity {
	private String username; //아이디
	private String password; //비밀번호
	private int age; //나이
	
	public String getUsername() {
		return username;
	}
	public UserEntity setUsername(String username) {
		this.username = username;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public UserEntity setPassword(String password) {
		this.password = password;
		return this;
	}
	public int getAge() {
		return age;
	}
	public UserEntity setAge(int age) {
		this.age = age;
		return this;
	}
	
	//DB 테이블을 Java 객체로 변환하며 본 객체에 내용 저장
	public UserEntity mappingToServer(UserSchema dbTable) {
		this.username = dbTable.getUsername();
		this.password = dbTable.getPassword();
		this.age = dbTable.getAge();
		return this;
	}
	
	//Java 객체를 DB 테이블로 전환
	public UserSchema mappingToDatabase() {
		return new UserSchema()
				.setUsername(this.username)
				.setPassword(this.password)
				.setAge(this.age);
	}
}
