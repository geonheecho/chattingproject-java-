package _92_ExMVC.server;

import java.util.ArrayList;

public class Service {
	
	Repository repository;
	
	public Service(Repository repository) {
		this.repository = repository;
	}
	
	public boolean loginService(Model model) {
		ArrayList<UserEntity> query = (ArrayList<UserEntity>) repository.userTable_findAll();
		System.out.println("[불러온 데이터]");
		System.out.println(query);
		LoginModel clientData = (LoginModel)model;
		boolean isMatching = false;
		for(int i = 0; i < query.size(); i++) {
			String dbData_id = query.get(i).getUsername();
			String dbData_pw = query.get(i).getPassword();
			if(clientData.id.equals(dbData_id) && clientData.pw.equals(dbData_pw)) {
				isMatching = true;
			}
		}
		return isMatching;
	}
	
	public void signUpService() {
//		repository.userTable_save(userEntity);
	}
	
	public void postingService() {
//		repository.postingTable_findAll();
	}
}
