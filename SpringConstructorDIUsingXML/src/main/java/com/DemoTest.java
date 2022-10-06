package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {
	public static void main(String[] args)
	{
		Resource rs=new ClassPathResource("beans.xml");
		BeanFactory bb=new XmlBeanFactory(rs);
		Employee employee1=(Employee)bb.getBean("emp1");
		employee1.display();
		Employee employee2=(Employee)bb.getBean("emp2");
		System.out.println(employee2);
		Employee employee7 = (Employee)bb.getBean("emp4");   // pulling through setter base 
		System.out.println(employee7);
		
		Address address1 = (Address)bb.getBean("add");
		System.out.println(address1);
		
		Employee employee8 = (Employee)bb.getBean("emp7");
		System.out.println(employee8);
		
		Employee employee9 = (Employee)bb.getBean("emp8");
		System.out.println(employee9);
	}
 

}
