package com.basic;

public class Main {

	public static void main(String[] args) {
		
		User user=new User();
		user.setPermanentUser(true);
		user.setUserId(123);
		user.setUserName("Anusha");
		user.setUserSalary(2000f);
	
		
		System.out.println(user.toString());
		
		
		User user2= new User(456, "Kalyani",300f,true);
		System.out.println(user2.toString());
	}
}
