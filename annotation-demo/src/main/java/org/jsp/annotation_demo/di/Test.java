package org.jsp.annotation_demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.annotation_demo");
		Hospital h = context.getBean(Hospital.class);
		h.display();
		Person p = context.getBean(Person.class);
		p.display();
	}
}
