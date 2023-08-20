package org.jsp.annotation_demo.autowire;

import org.springframework.stereotype.Component;

@Component(value = "train")
public class Train implements Vehicle {

	public void start() {
		System.out.println("Train has been started");
	}

}
