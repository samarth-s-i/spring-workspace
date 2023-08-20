package org.jsp.spring_demo.life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycleByAppilcationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		System.out.println(context.getBean("demo"));
		System.out.println(context.getBean("demo"));
		((ClassPathXmlApplicationContext) context).close();
	}
}
