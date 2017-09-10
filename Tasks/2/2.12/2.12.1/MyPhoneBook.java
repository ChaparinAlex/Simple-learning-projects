package com.brainacad.oop.testnest1;

public class MyPhoneBook {
	private MyPhoneBook.PhoneNumber[] phoneNumbers = 
			new MyPhoneBook.PhoneNumber[10];
		
	public void addPhoneNumber(String name, String phone){
		for (int i = 0; i < phoneNumbers.length; i++){
			if (phoneNumbers[i] == null){
				phoneNumbers[i] = new MyPhoneBook.PhoneNumber(name, phone);
				return;
			}
		}
	}
	
	public void printPhoneBook(){
		for (int i = 0; i < phoneNumbers.length; i++){
			if (phoneNumbers[i] != null){
				System.out.println(phoneNumbers[i]);
			}
		}
	}
    
	static class PhoneNumber{
		private String name;
		private String phone;
		
		public PhoneNumber(String name, String phone){
			this.name = name;
			this.phone = phone;
		}

		public String getName() {
			return name;
		}

		public String getPhone() {
			return phone;
		}
		
		@Override
		public String toString(){
			return "Name: " + name + ", phone: " + phone + "\n"; 
		}
	}
}
