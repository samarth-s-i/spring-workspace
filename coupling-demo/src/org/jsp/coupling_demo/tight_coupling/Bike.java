package org.jsp.coupling_demo.tight_coupling;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike has been started");
	}

}
