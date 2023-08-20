package org.jsp.spring_demo.init_destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		Test t = context.getBean("test", Test.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
