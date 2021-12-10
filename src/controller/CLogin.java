package controller;

import entity.ELogin;

public class CLogin {
	private ELogin eLogin;

	public boolean valudateUser(String ID, String password) {
		this.eLogin = new ELogin();
		boolean result = this.eLogin.validateUser(ID, password);
		return result;
	}

}
