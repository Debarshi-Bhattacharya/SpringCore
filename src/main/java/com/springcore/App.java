package com.springcore;


import com.springcore.dependencyInjection.Employee;
import com.springcore.dependencyInjection.Person;
import com.springcore.dependencyInjection.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    private static ApplicationContext context_setter,context_constructor,context_autowire,context_standAlone,context_stereoType;

	public static void main( String[] args )
    {
        context_setter = new ClassPathXmlApplicationContext
                ("com/springcore/dependencyInjection/setterInjectionConfig.xml");
        Student student1=(Student) context_setter.getBean("student1");
        System.out.println("Setter Injection");
        System.out.println(student1);
        System.out.println("********************************************************");
        
        context_constructor=new ClassPathXmlApplicationContext
                ("com/springcore/dependencyInjection/constructorInjectionConfig.xml");
        Student student1_con=(Student) context_constructor.getBean("student1");
        System.out.println("Constructor Injection");
        System.out.println(student1_con);
        System.out.println("********************************************************");
        
        context_autowire=new ClassPathXmlApplicationContext
                ("com/springcore/dependencyInjection/autowiringConfig.xml");
        Employee emp1=(Employee) context_autowire.getBean("emp1");
        System.out.println("Autowiring byName");
        System.out.println(emp1);
        System.out.println("********************************************************");
       
        Employee emp2=(Employee) context_autowire.getBean("emp2");
        System.out.println("Autowiring by annotation");
        System.out.println(emp2);
        System.out.println("********************************************************");
        
        context_standAlone=new ClassPathXmlApplicationContext
                ("com/springcore/dependencyInjection/constructorInjectionConfig.xml");
        Student student1_standAlone=context_constructor.getBean("student1",Student.class);
        System.out.println("Stand Alone Constructor");
        System.out.println(student1_standAlone);
//        Student student2_standAlone=context_constructor.getBean("student2",Student.class);
//        System.out.println(student2_standAlone);
        System.out.println("********************************************************");
        
        context_stereoType=new ClassPathXmlApplicationContext
                ("com/springcore/dependencyInjection/stereoConfig.xml");
        Person person=context_stereoType.getBean("per",Person.class);
        System.out.println("Stereotype annotation");
        System.out.println(person);
        
        
        
    }
}
