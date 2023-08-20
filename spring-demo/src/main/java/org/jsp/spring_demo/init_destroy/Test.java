package org.jsp.spring_demo.init_destroy;

public class Test {
	static {
		System.out.println("Test class is loaded into the JVM memory");
	}

	public void hii() {
		System.out.println("Hii from Test class");
	}

	public void byee() {
		System.out.println("Byee from Test class");
	}
}
