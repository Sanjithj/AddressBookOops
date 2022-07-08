package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("welcome to the address book management");
		Scanner sc =new Scanner(System.in);
		int option;
		do {
			 System.out.println("1. display contact\n 2. add contact\n 3. edit contact\n 4. exit");
			option =sc.nextInt();
			switch(option) {
			case 1:
				AddressBook.display();
				break;
			case 2:
				AddressBook.add_contact();
				break;
			case 4:
				AddressBook.edit_contact();
				break;
			default:
				System.out.println("please enter the correct option");
			}
			}while(option !=0);
		System.out.println("please keep visiting my website");
		}
}