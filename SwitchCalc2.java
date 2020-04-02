package com.java.one;

import java.util.Scanner;

public class SwitchCalc2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//두수를 입력, 연산자 입력
		System.out.println("num1 입력");
		int num1=sc.nextInt();
		
		System.out.println("num2 입력");
		int num2=sc.nextInt();
		
		//연산자 입력
		System.out.println("연산자 입력 (+,/,*,-) : ");
		String oper=sc.next();
		double result = 0;
		//연산자에 의한 계산
		switch (oper) {
		case "+":
			result=num1+num2;
			break;

		case "-":
			result=num1-num2;
			break;
			
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=(float)num1/num2;
			break;
			
		default:
			System.out.println("연산자 잘못 입력");
			break;
		}
		boolean flag=oper.equals("+")|| 
		oper.equals("-")|| oper.equals("*")|| 
		oper.equals("/");
		if(flag) {
		System.out.println(oper+"결과값 : "+result);
		sc.close();
		}
}
}