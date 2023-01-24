package com.springcore.dependencyInjection.configurationAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	private static ApplicationContext contextAnnotationConfig;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contextAnnotationConfig=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1=contextAnnotationConfig.getBean("student",Student.class);
		System.out.println(s1);
		System.out.println("********************************************************");
		System.out.println("Annotation only inside the Configuration class:");
		Employee e1=contextAnnotationConfig.getBean("getEmployee",Employee.class);//here we have call the bean by the method name
		//inside which the object is creating.
		e1.work();
	}

}
