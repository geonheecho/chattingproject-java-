package _92_ExMVC.server;

import java.util.ArrayList;

import _92_ExMVC.DBMS.Database;
import _92_ExMVC.DBMS.UserSchema;


public class Repository {
	private Database db = new Database();
	
	public ArrayList<UserEntity> userTable_findAll() {
		ArrayList<UserEntity> toServer = new ArrayList<UserEntity>();
		ArrayList<UserSchema> dbDatas = db.userTable;
		for(int i = 0; i < dbDatas.size(); i++) {
			toServer.add(new UserEntity().mappingToServer(dbDatas.get(i)));
		}
		return toServer; 
	}
	
	public boolean userTable_save(UserEntity userEntity) {
		return db.userTable.add(userEntity.mappingToDatabase());
	}
	
	public ArrayList postingTable_findAll() {
		return db.postingTable;
	}
}
