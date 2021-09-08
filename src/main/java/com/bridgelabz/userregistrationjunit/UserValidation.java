package com.bridgelabz.userregistrationjunit;

public class UserValidation {

	public boolean validateName(String name) {

		String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
		return name.matches(nameRegex);
	}

}
