package org.jsp.spring_demo.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("car.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Car c = factory.getBean("myCar", Car.class);
		c.start();
	}
}
