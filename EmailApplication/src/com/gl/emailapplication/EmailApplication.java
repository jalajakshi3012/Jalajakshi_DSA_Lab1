package com.gl.emailapplication;

import java.util.Scanner;

public class EmailApplication {
	
	public void init()
	{
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName=scanner.nextLine();
		System.out.println("Please enter your last name");
		String lastName=scanner.nextLine();
		
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resurces");
		System.out.println("4. Legal");
		
		int departmentId=scanner.nextInt();
	
	
	CredentialServiceManagerimpl service=new CredentialServiceManagerimpl();
	String email=service.generateEmailAddress(firstName,lastName,departmentId);
	String password=service.generatePassword();
	Employee employee=new Employee(firstName, lastName, email,password);
	service.displayCredentials(employee);
	
	
	}
}
