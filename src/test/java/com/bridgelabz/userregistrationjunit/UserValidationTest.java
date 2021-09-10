package com.bridgelabz.userregistrationjunit;

import org.junit.Assert ; 
import org.junit.Test;
import com.bridgelabz.userregistrationjunit.UserValidation;

public class UserValidationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Ashika");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("ashika");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("As");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldReturnFalse(){
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateName(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Name. NULL Name Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnFalse(){
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateName("");
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Name. EMPTY Name Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenFirstName_WhenNumericCharatersArePresent_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Asjsak23");
		Assert.assertFalse(isNotValid);
		
	}

	@Test
	public void givenFirstName_WhenSpecialCharatersArePresent_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Asjsak@^");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Chadaga");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("chadaga");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Ch");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenNull_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateName(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Name. NULL Name Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateName("");
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Name. EMPTY Name Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenLastName_WhenNumericCharatersArePresent_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Chadag19");
		Assert.assertFalse(isNotValid);
		
	}

	@Test
	public void givenLastName_WhenSpecialCharatersArePresent_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Ch@d@ga%");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateEmail("ashikachadaga@gmail.com");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateEmail("abc()*@gmail.com");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateEmail(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Email Address. NULL Email Address Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateEmail("");
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Email Address. EMPTY Email Address Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateMobileNumber("91 9485736453");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber("919485736453");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber("91 5736453");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateMobileNumber(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Mobile Number. NULL Mobile Number Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validateMobileNumber("");
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Mobile Number. EMPTY Mobile Number Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenMobileNumber_WhenCharatersArePresent_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber("9a 948375053h");
		Assert.assertFalse(isNotValid);
		
	}

	@Test
	public void givenMobileNumber_WhenSpecialCharatersArePresent_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber("#6 948375*535");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validatePassword("AshikaCh@dag11");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPassword_WhenNull_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validatePassword(null);
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Password. NULL Password Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		try {
			userValidator.validatePassword("");
		}
		catch(UserValidationException e){
			Assert.assertEquals("Please Enter Valid Password. EMPTY Password Entered.",e.getMessage());
		}
		
	}
	
	@Test
	public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("sd@A12");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("asjd23$df");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("asjdAG$df");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() throws UserValidationException{
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("asjd23^$df");
		Assert.assertFalse(isNotValid);
	}

}
