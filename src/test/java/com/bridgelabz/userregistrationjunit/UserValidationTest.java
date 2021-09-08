package com.bridgelabz.userregistrationjunit;

import org.junit.Assert ;
import org.junit.Test;

import com.bridgelabz.userregistrationjunit.UserValidation;

public class UserValidationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Ashika");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("ashika");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("As");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Chadaga");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("chadaga");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Ch");
		Assert.assertFalse(isNotValid);
		
	}
	
}
