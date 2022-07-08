package com.bridgelabz;

import java.util.Scanner;

public class AddressBook extends Contacts {

	private static String last_name;
	private static String first_name;
	private static String Address;
	private static String city;
	private static String email;
	private static String phone_number;
	private static String state;
	private static AddressBook contacts;
	
	
	public static void main(String[] args) {
	 System.out.println("Welcome to Address Book in Oops Concepts");
	
				   Scanner scanner=new Scanner(System.in);
				   System.out.println("Enter the first name: " + "");
				   firstName = scanner.next();
					
					System.out.println("Enter the last name: " + "");
					lastName = scanner.next();
					
					System.out.println("Enter the address: ");
					address = scanner.next();
				
					System.out.println("Enter the city: ");
					city = scanner.next();	
					
					System.out.println("Enter the state: ");
					state = scanner.next();
					
					System.out.println("Enter the email: ");
					String emails = scanner.next();
					
					System.out.println("Enter the zipcode: ");
					zipcode = scanner.nextInt();
					
					System.out.println("Enter the phone number: ");
					phone = scanner.nextLong();
					
					
					
					contacts = new AddressBook(); 
					System.out.println("Name: "+AddressBook.first_name+" "+AddressBook.last_name+"\n Address: "+AddressBook.Address+".\n city :"+AddressBook.city+"\n state"+AddressBook.state+"\n phone number:"+AddressBook.phone_number+"\n email"+AddressBook.email);
					
				
			}
			
	}

