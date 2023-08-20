package org.jsp.annotation_demo.di;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void start() {
		System.out.println("Car has been started");
	}
}
