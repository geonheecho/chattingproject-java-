package _92_ExMVC.DBMS;

import java.util.ArrayList;

public class Database {
	public ArrayList<UserSchema> userTable = new ArrayList<UserSchema>();
	public ArrayList<PostingSchema> postingTable = new ArrayList<PostingSchema>();
	
	public Database(){
		userTable.add(new UserSchema()
				.setUsername("quotia72")
				.setPassword("1234")
				.setAge(15));
		postingTable.add(new PostingSchema()
				.setPosterName("quotia72")
				.setContent("Hello IT World"));
	}
}
