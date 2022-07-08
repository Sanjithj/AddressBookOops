package com.bridgelabz;

public class Contacts {
	
	static String firstName;
	static String lastName;
	static String address;
	String city;
	String state;
	String email;
	static int zipcode;
	static long phone;
	public void Contact(String firstName, String lastName, String address, String city, String state, String email, int zipcode, long phone)
	{
		Contacts.firstName=firstName;
		Contacts.lastName=lastName;
		Contacts.address=address;
		this.city=city;
		this.state=state;
	    this.email=email;
		Contacts.zipcode=zipcode;
		Contacts.phone=phone;
	}
	public String getFirstName() {
		return firstName;
		
	}
	public void setFirstName(String firstName) {
		Contacts.firstName = firstName;
	}
	public String toString() {
		return "Contact[firstName=" + firstName + ", lastName= " + lastName + ", address=" + address + ", city=" + city + ", state=" + state + ",email=" + email + ", zipcode=" + zipcode + ", phone=" + phone + "]";
		
	}

}
