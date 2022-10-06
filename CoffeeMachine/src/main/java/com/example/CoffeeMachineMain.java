package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CoffeeMachineMain {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	Cappcino cp=ac.getBean(Cappcino.class);
	cp.rateOfCoffee();
	cp.typeOfCoffee();
	System.out.println(cp.getCream());
	Xpreso xp=ac.getBean(Xpreso.class);
	xp.rateOfCoffee();
	xp.typeOfCoffee();
	
}
}