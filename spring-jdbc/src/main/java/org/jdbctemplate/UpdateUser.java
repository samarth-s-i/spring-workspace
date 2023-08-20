package org.jdbctemplate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateUser {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id: ");
		int id = sc.nextInt();
		System.out.println("Enter the phone, email and password to update");
		template.execute("update user set phone=" + sc.nextLong() + ",email=" + "'" + sc.next() + "'" + ",password="
				+ "'" + sc.next() + "'" + " where id=" + id);
		System.out.println("User has been updated");
	}
}
