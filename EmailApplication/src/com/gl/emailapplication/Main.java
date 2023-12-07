package com.gl.emailapplication;

public class Main {

	public static void main(String[] args) {
		
		emailApplicationentry();
		//testGeneratedEmail();
		//testGeneratedPassword();
		
	}
		// TODO Auto-generated method stub
		static void testGeneratedEmail(){
		CredentialServiceManagerimpl credentialServiceManagerimpl=new CredentialServiceManagerimpl();
		
		String emailAddress=credentialServiceManagerimpl.generateEmailAddress("harshit","chauhan", 1);
		System.out.println(emailAddress);
		}
		
		static void testGeneratedPassword()
		{
			CredentialServiceManagerimpl credentialServiceManagerimpl=new CredentialServiceManagerimpl();
			String password=credentialServiceManagerimpl.generatePassword();
			System.out.println(password);
			
		}
		
		static void emailApplicationentry() {
			EmailApplication emailApplication=new EmailApplication();
			emailApplication.init();
		}
		

	}


