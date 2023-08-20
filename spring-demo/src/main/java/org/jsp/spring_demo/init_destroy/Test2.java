package org.jsp.spring_demo.init_destroy;

public class Test2 {
	static {
		System.out.println("Test2 class is loaded into the JVM memory");
	}

	public void hii() {
		System.out.println("Hii from Test2 class");
	}

	public void byee() {
		System.out.println("Byee from Test2 class");
	}
}
