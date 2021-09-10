package com.bridgelabz.userregistrationjunit;

public class UserValidation {
	
	public boolean validateName(String name) throws UserValidationException {

		try {
			if (name.length() == 0) {
				throw new UserValidationException("Please Enter Valid Name. EMPTY Name Entered.");
			}
			String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
			return name.matches(nameRegex);
			
		} 
		catch (NullPointerException e) {
			throw new UserValidationException("Please Enter Valid Name. NULL Name Entered.");
		}
	}
	

	public boolean validateEmail(String email) throws UserValidationException {

		try {
			if (email.length() == 0) {
				throw new UserValidationException("Please Enter Valid Email Address. EMPTY Email Address Entered.");
			}
			String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
			return email.matches(emailRegex);
		} 
		catch (NullPointerException e) {
			throw new UserValidationException("Please Enter Valid Email Address. NULL Email Address Entered.");

		}
	}

	public boolean validateMobileNumber(String mobileNumber) throws UserValidationException {

		try {
			if (mobileNumber.length() == 0) {
				throw new UserValidationException("Please Enter Valid Mobile Number. EMPTY Mobile Number Entered.");			
			}
			String mobileNumberRegex = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
			return mobileNumber.matches(mobileNumberRegex);
		} 
		catch (NullPointerException e) {
			throw new UserValidationException("Please Enter Valid Mobile Number. NULL Mobile Number Entered.");
		}
	}

	public boolean validatePassword(String password) throws UserValidationException {

		try {
			if (password.length() == 0) {
				throw new UserValidationException("Please Enter Valid Password. EMPTY Password Entered.");
			}
			String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";
			return password.matches(passwordRegex);

		} catch (NullPointerException e) {
			throw new UserValidationException("Please Enter Valid Password. NULL Password Entered.");
		}	
	}
	

}
