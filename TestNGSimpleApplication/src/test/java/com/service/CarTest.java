package com.service;

import org.testng.annotations.Test;

public class CarTest {
	@Test(groups = {"speed"})
	  public void speed() {
		  System.out.println("car speed testing");
	  }
	  @Test(groups = {"mailege","speed"})
	  public void mailege() {
		  System.out.println("car mailege testing");
	  }
	  @Test
	  public void color() {
		  System.out.println("car color testing");
	  }
}
