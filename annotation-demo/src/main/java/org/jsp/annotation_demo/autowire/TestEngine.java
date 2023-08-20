package org.jsp.annotation_demo.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEngine {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp.annotation_demo.autowire");
		Bus b = context.getBean(Bus.class);
		b.getE().start();
	}
}
