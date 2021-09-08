package com.bridgelabz.userregistrationjunit;

public class UserValidation {

	public boolean validateName(String name) {

		String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
		return name.matches(nameRegex);
	}
	public boolean validateEmail(String email) {

		String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		return email.matches(emailRegex);
	}

}
