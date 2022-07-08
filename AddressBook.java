package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

	private static String last_name;
	private static String first_name;
	private static String Address;
	private static String city;
	private static String email;
	private static String phone_number;
	private static String state;
	
	public static void main(String[] args) {
	 System.out.println("Welcome to Address Book in Oops Concepts");
	
				   Scanner scanner=new Scanner(System.in);
				   System.out.println("Enter the first name: " + "");
					String firstName = scanner.next();
					
					System.out.println("Enter the last name: " + "");
					String lastName = scanner.next();
					
					System.out.println("Enter the address: ");
					String address = scanner.next();
				
					System.out.println("Enter the city: ");
					String city = scanner.next();
					
					System.out.println("Enter the state: ");
					String state = scanner.next();
					
					System.out.println("Enter the email: ");
					String email = scanner.next();
					
					System.out.println("Enter the zipcode: ");
					int zipcode = scanner.nextInt();
					
					System.out.println("Enter the phone number: ");
					long phone = scanner.nextLong();
					
					
					
					AddressBook contacts=new AddressBook(); 
					System.out.println("Name: "+AddressBook.first_name+" "+AddressBook.last_name+"\n Address: "+AddressBook.Address+".\n city :"+AddressBook.city+"\n state"+AddressBook.state+"\n phone number:"+AddressBook.phone_number+"\n email"+AddressBook.email);
					
				
			}
			
	}

