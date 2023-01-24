package com.springcore.dependencyInjection.configurationAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//this annotation is used declare that this java class is used for configuration of bean instead of xml 
@ComponentScan(basePackages = "com.springcore.dependencyInjection.configurationAnnotation")
//to tell the IOC container where to scan for the Component class to make objects
public class JavaConfig {
		
	@Bean
	//we are making object of the Employee class inside this java configuration file
	//so inside the Employee class we need not to use the @Component annotation
	public Employee getEmployee()
	{
		Employee employee=new Employee();
		return employee;
	}
}
