package org.jsp.annotation_demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.annotation_demo");
		Car c = context.getBean(Car.class);
		c.start();
	}
}
