package org.jsp.spring_demo.bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bike.xml");
		Bike b = applicationContext.getBean("myBike", Bike.class);
		b.getE().start();
	}
}
