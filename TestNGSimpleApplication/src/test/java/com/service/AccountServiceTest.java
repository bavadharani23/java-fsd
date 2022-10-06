package com.service;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.bean.Account;

public class AccountServiceTest {
	

  @Test
  @Ignore
  public void createAccountTest() {
	  AccountService ac=new AccountService();
	  Account acc1=new Account(100,"ravi",400);
	  String result1=ac.createAccount(acc1);
	  assertEquals(result1,"Min amount must be 500");
	  
	  Account acc2=new Account(101,"raj",1400);
	  String result2=ac.createAccount(acc2);
	  assertEquals(result2,"Account created");
	  
//	  Account acc3=new Account(100,"raj",10000);
//	  String result3=ac.createAccount(acc3);
//	  assertEquals(result3,"Account didn't created");
	  
    
  }

  @Test
  @Ignore
  public void depositTest() {
	  AccountService ac = new AccountService();
	  Account acc1 = new Account();
	  acc1.setAccno(100);
	  acc1.setAmount(15000);
	  
	  String result1 = ac.deposit(acc1);
	  assertEquals(result1, "Deposit done successfully");
	  
	  Account acc2 = new Account();
	  acc2.setAccno(100);
	  acc2.setAmount(55000);
	  String result2 = ac.deposit(acc2);
	  assertEquals(result2, "You can't deposite 50000 at time");
  }

  @Test
  @Ignore
  public void findBalanceTest() {
	  AccountService ac = new AccountService();
	  String balanceDetails1 = ac.findBalance(100);
	  String balanceDetails2 = ac.findBalance(102);
	  String balanceDetails3 = ac.findBalance(1000);
	  assertEquals(balanceDetails1, "Your account balance is 501.0");
	  assertEquals(balanceDetails2, "Your account balance is 1000.0");
	  assertEquals(balanceDetails3, "Account number doesn't exist");
	  
	  
	  
	  
   
  }

  @Test
  @Ignore
  public void withdrawnTest() {
AccountService ac = new AccountService();
	 
	  
	  Account acc1 = new Account();
	  acc1.setAccno(100);
	  acc1.setAmount(199);
	  String result1 = ac.withdrawn(acc1);
	  assertEquals(result1, "Withdrawn done successfully");
	  
//	  Account acc2 = new Account();
//	  acc2.setAccno(1000);
//	  acc2.setAmount(100);
//	  String result2 = ac.withdrawn(acc2);
//	  assertEquals(result2, "Invalid account number");
	  
//	  Account acc3 = new Account();
//	  acc3.setAccno(102);
//	  acc3.setAmount(5000);
//	  String result3 = ac.withdrawn(acc3);
//	  assertEquals(result3, "Your can't withdraw you have to maintain min 500");
  }
}
