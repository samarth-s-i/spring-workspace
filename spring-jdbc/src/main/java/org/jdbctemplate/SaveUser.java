package org.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SaveUser {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		template.execute("insert into user values(1,8892,'sam@gmail.com','abc123')");
		System.out.println("User table has been created");
	}
}
