package org.jsp.spring_demo.pan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("pancard.xml");
		CardHolder cardHolder = applicationContext.getBean("myPerson", CardHolder.class);
		cardHolder.getCard().display();
	}
}
