package org.jsp.annotation_demo.bean_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Department d = context.getBean(Department.class);
		System.out.println(d.getNames());
		System.out.println(d.getIds());
	}
}
