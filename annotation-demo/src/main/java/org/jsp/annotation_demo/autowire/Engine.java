package org.jsp.annotation_demo.autowire;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public void start() {
		System.out.println("Engine started");
	}
}
