package org.jsp.annotation_demo.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	private String name, founder;

	public Hospital(@Value(value = "Apollo") String name, @Value(value = "Modi") String founder) {
		this.name = name;
		this.founder = founder;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Founder: " + founder);
		System.out.println("-------------------");
	}
}
