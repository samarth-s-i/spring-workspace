package org.jsp.spring_demo.life_cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean, DisposableBean {
	static {
		System.out.println("Demo class has been loaded into JVM memory");
	}

	public Demo() {
		System.out.println("Object is getting created");
	}

	public void destroy() throws Exception {
		System.out.println("Demo object is destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Demo object is initialized");
	}

}
