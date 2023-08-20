package org.jsp.spring_demo.user;

public class User {
	private long phone;
	private String password;

	public void display() {
		System.out.println("Phone: " + phone + "\nPassword: " + password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(long phone, String password) {
		super();
		this.phone = phone;
		this.password = password;
		System.out.println("Parameterized constructor of User class");
	}

	public User() {
		System.out.println("No arg constructor of User class");
	}
}
