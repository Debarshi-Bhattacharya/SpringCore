package com.springcore.dependencyInjection;

import java.util.Set;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per")
//this annotation is to create object without creating bean inside xml configuration
//we can mention the object name(here we did 'per'), otherwise it will follow camel casing to name the object(here it will be person)
public class Person {
	
	//value annotation
	@Value("Deba")
	private String name;
	@Value("24")
	private int age;
	
	//we are using spring expression language here
	@Value("#{phones}")
	private Set<String> phoneNumbers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phoneNumbers=" + phoneNumbers + "]";
	}
	

}
