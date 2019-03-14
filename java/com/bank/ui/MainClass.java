package com.bank.ui;

import java.util.*;

import com.bank.service.CustomerService;
import com.bank.service.CustomerServiceImpl;
import com.bank.service.TransactionService;
import com.bank.service.TransactionServiceImpl;;

public class MainClass {
public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter your choice:\n 1. customer details\n 2. Transaction");
	int ch=input.nextInt();
	TransactionService transactoionService=new TransactionServiceImpl();
	CustomerService customerService=new CustomerServiceImpl();
	switch(ch)
	{
	case 1:
		
	}
}
}
