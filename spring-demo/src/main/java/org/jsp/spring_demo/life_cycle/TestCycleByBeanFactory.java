package org.jsp.spring_demo.life_cycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCycleByBeanFactory {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("lifecycle.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println(factory.getBean("demo"));
		System.out.println(factory.getBean("demo"));
		System.out.println(factory.getBean("demo"));
	}
}
