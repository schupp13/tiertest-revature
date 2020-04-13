package com.revature.model;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private int role;
	
	
	
	
	public User(int id, String firstName, String lastName, String username, String password, int role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public int Sum(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
		
	}
	
	public boolean power(int num) {
		
		String stringOfInt = Integer.toString(num);
		
		int sum = 0;
		System.out.println(stringOfInt);
		for (int i = 0;i < stringOfInt.length(); i++){
		    int newInt = stringOfInt.charAt(i) - '0';
		    sum+= Math.pow(newInt, stringOfInt.length());
		    
		}
		
		return sum == num;
		
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
}
