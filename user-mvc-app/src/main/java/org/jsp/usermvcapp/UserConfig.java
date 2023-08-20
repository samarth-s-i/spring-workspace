package org.jsp.usermvcapp;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.usermvcapp")
public class UserConfig {
	public EntityManager getEntity() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
}
