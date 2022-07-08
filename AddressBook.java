package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends Contact {

	public static ArrayList<Contact>addressBook = new ArrayList<Contact>();
	
	public Contact inputDetails() {
		
		Scanner scanner = new Scanner(System.in);
		
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
		
		System.out.println("Refactor the contacts: ");
		
		
		Contact contact = new Contact(firstName, lastName, address, city, state, email, zipcode, phone);
			
		return contact;
		}
		public void displayContact() {
		 
			for (Contact contact : addressBook)
		 		{
					System.out.println(contact);
		 		}
	    }
	 
	 	public void addContact() {
	 		
	 			addressBook.add(inputDetails());
     	}
     public int findContact(String firstName) {
    	 for (Contact contact : addressBook) {
    		 if(firstName.compareToIgnoreCase(contact.getFirstName())==0) {
    			 return addressBook.indexOf(contact);
    		 }
    	 }
		return 0;
     }
		public void editContact() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter the first name: ");
			String firstName = scanner.next();
			
			int index = findContact(firstName);
			
			if(index == -1) {
				System.out.println(" null no contact");
				return;
			}
			addressBook.set(index,inputDetails());
		}
		public void deleteContact() {
			System.out.println("Enter the first name to be deleted :");
		    String first_name = sc.next();
		    if(first_name.equals(first_name))
		    {
		        System.out.println("The details are found!!");
		        first_name="";
		        last_name="";
		        Address="";
		        phone_number=(Long) null;
		        state="";
		        city="";
		        email="";

		        System.out.println("finally your contact deleted");
		    }
		}

		}
}
