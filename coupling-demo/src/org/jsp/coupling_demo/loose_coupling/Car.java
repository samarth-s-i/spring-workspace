package org.jsp.coupling_demo.loose_coupling;

public class Car {
	private Engine e = new Engine();

	void startEngin() {
		e.start();
	}
}
