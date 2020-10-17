package _92_ExMVC.server;

import _92_ExMVC.client.Login;
import _92_ExMVC.client.Posting;
import _92_ExMVC.client.SignUp;

public class Controller {
	
	Repository repository = new Repository();
	Service handler = new Service(repository);
	
	public boolean doGet(Object request) {
		
		boolean response = false;
		
		if(request instanceof Login) {
			Model parsingData = Utils.loginToModel((Login)request);
			response = handler.loginService(parsingData);
		}else if(request instanceof SignUp) {
			
		}else if(request instanceof Posting) {
			
		}else {
			System.out.println("해당 서비스 및 페이지는 존재하지 않습니다.");
		}
		return response;
		
	}
}
