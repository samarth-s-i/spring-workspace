package org.jsp.annotation_demo.bean_configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.annotation_demo.bean_configuration")
public class MyConfig {
	@Bean
	public List<String> getList() {
		return new ArrayList<String>(Arrays.asList("A", "B", "C"));
	}

	@Bean
	public Set<Integer> getSet() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		return set;
	}
}
