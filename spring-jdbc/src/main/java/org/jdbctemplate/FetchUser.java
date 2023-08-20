package org.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class FetchUser {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		@SuppressWarnings("unused")
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println("User table has been created");
	}
}
