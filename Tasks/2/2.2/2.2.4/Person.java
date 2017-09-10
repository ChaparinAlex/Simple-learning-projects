package labs;

public class Person {
  private String firstName;
  private String lastName;
  private int age;
  private String gender;
  private int phoneNumber;
  
  public void setFields(String firstName, String lastName, int age, 
		  String gender, int phoneNumber){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.age = age;
	  this.gender = gender;
	  this.phoneNumber = phoneNumber;
  }
  
  public void setFields(String firstName, String lastName, int age, 
		  String gender){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.age = age;
	  this.gender = gender;
	  this.phoneNumber = 0;
  }
  
  public void setFields(String firstName, String lastName, int age){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.age = age;
	  this.gender = "n/a";
	  this.phoneNumber = 0;
  }
  
  public void setFields(String firstName, String lastName){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.age = 0;
	  this.gender = "n/a";
	  this.phoneNumber = 0;
  }
  
  public void setFields(String firstName){
	  this.firstName = firstName;
	  this.lastName = "n/a";
	  this.age = 0;
	  this.gender = "n/a";
	  this.phoneNumber = 0;
  }
  
  public void print(){
	  System.out.println("First name: " + firstName + "\nLast name: " +  
  lastName + "\nAge: " + age + "\nGender: " + gender + "\nPhone number: " + 
			  phoneNumber + "\n");
  }
}
