package org.jsp.annotation_demo.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value(value = "25")
	private int age;
	private String name;

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	@Value(value = "Virat")
	public void setName(String name) {
		this.name = name;
	}
}
