package com.bridgelabz;

public class Contact {
		
		static String firstName;
		static String lastName;
		static String address;
		String city;
		String state;
		String email;
		static int zipcode;
		static long phone;
		public Contact(String first_name, String last_name, String address2, String city2, String state2,
				long phone_number, String email2) {
			
		}
		public Contact(String firstName, String lastName, String address, String city, String state, String email, int zipcode, long phone)
		{ 
			Contact.firstName=firstName;
			Contact.lastName=lastName;
			Contact.address=address;
			this.city=city;
			this.state=state;
		    this.email=email;
			Contact.zipcode=zipcode;
			Contact.phone=phone;
		}
		public String getFirstName() {
			return firstName;
			
		}
		public void setFirstName(String firstName) {
			Contact.firstName = firstName;
		}
		public String toString() {
			return "Contact[firstName=" + firstName + ", lastName= " + lastName + ", address=" + address + ", city=" + city + ", state=" + state + ",email=" + email + ", zipcode=" + zipcode + ", phone=" + phone + "]";
			
		}

	}


