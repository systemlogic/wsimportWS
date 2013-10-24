package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class Hello{
	@WebMethod
	public String hi(String str){
		System.out.println("Hi " + str + " !!" );
		return "Hi " + str + " !!" ;
	}
	@WebMethod
	public int sum(int a, int b){
		int sum = a + b ;
		System.out.println("Sum="+sum);
		return sum;
	}
}
