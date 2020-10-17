package _92_ExMVC.server;

import _92_ExMVC.client.Login;

public class Utils {
	public static Model loginToModel(Login login) {
		LoginModel converted = new LoginModel();
		converted.id = login.typedUsername;
		converted.pw = login.typedPassword;
		return converted;
	}
}
