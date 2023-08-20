package org.jsp.spring_demo.person;

public class Person {
	private int age;
	private String name;

	public void display() {
		System.out.println("Age: " + age + "\nName: " + name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
