package org.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateUser {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		template.execute(
				"create table user(id int not null,phone bigint(10) not null,email varchar(100) not null,password varchar(30) not null,primary key(id))");
		System.out.println("User table has been created");
	}
}
