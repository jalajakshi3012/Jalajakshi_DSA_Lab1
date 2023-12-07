package com.gl.emailapplication;


public class CredentialServiceManagerimpl implements ICredentialServiceManager {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetters="ABCDEFGHIJKLMNPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="1234567890";
		String specialCharacters="~!@#$%^&*(){}[]?><_+-':";
		/*
		 * String allcharaters=capitalLetters+smallLetters+numbers+specialCharacters;
		 * int maxLength=allcharaters.length(); StringBuilder passwordBuilder=new
		 * StringBuilder(); for(int i=0;i<8;i++) { java.util.Random randomObj = new
		 * java.util.Random(); int randomNumber=randomObj.nextInt(maxLength); char
		 * randomChar=allcharaters.charAt(randomNumber);
		 * passwordBuilder.append(randomChar); }
		 */
		StringBuilder passwordBuilder=new StringBuilder();
		
		for(int i=1;i<=2;i++)
		{
			java.util.Random randomObj = new java.util.Random();
			int randomNumber=randomObj.nextInt(capitalLetters.length());
			char randomChar=capitalLetters.charAt(randomNumber);
			passwordBuilder.append(randomChar);
		}
		for(int i=1;i<=2;i++)
		{
			java.util.Random randomObj = new java.util.Random();
			int randomNumber=randomObj.nextInt(smallLetters.length());
			char randomChar=smallLetters.charAt(randomNumber);
			passwordBuilder.append(randomChar);
		}
		for(int i=1;i<=2;i++)
		{
			java.util.Random randomObj = new java.util.Random();
			int randomNumber=randomObj.nextInt(numbers.length());
			char randomChar=numbers.charAt(randomNumber);
			passwordBuilder.append(randomChar);
		}
		for(int i=1;i<=2;i++)
		{
			java.util.Random randomObj = new java.util.Random();
			int randomNumber=randomObj.nextInt(specialCharacters.length());
			char randomChar=specialCharacters.charAt(randomNumber);
			passwordBuilder.append(randomChar);
		}
		
		return passwordBuilder.toString();
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, int department) {
		// TODO Auto-generated method stub
		
		StringBuilder emailBuilder=new StringBuilder();
		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(".");
		emailBuilder.append(lastName.toLowerCase());
		String departmentName=null;
		switch (department) {
		case 1: {
			departmentName="tech";
			break;
			}
		case 2:{
			departmentName="admin";
			break;
		}
		case 3:{
			departmentName="hr";
			break;
		}
		case 4:{
			departmentName="legal";
			break;
		}
		default:
		System.out.println("incorrect deparment id");
		 System.exit(0);
		}
		emailBuilder.append("@");
		emailBuilder.append(departmentName);
		emailBuilder.append(".");
		emailBuilder.append("gl.com");
		
		return emailBuilder.toString();
	}

	@Override
	public void displayCredentials(Employee employee) {
		// TODO Auto-generated method stub
		
		System.out.println("Dear "+employee.firstName+" your generated credentials are as follows");
		System.out.println("Email     ---> "+employee.emailAddress);
		System.out.println("Password  --->"+employee.password);
	}

}
