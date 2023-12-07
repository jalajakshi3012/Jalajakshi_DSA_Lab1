package com.gl.emailapplication;

public interface ICredentialServiceManager {
	
	public String generatePassword();
	
	public String generateEmailAddress(String firstName,String lastName,int department);
	
	public void displayCredentials(Employee employee);
	
	

}
