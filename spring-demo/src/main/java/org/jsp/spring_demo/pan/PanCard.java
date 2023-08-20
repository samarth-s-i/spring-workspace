package org.jsp.spring_demo.pan;

public class PanCard {
	private String name, number;

	public void display() {
		System.out.println("Pan card number: " + number + "\nName: " + name);
	}

	public String getName() {
		return name;
	}

	public PanCard(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public PanCard() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
