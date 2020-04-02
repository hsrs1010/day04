package com.java.one;

import java.util.Scanner;

public class SwitchCalc {
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
		
		//연산자에 의한 계산
		switch (oper) {
		case "+":
			System.out.println("덧셈 : "+(num1+num2));
			break;

		case "-":
			System.out.println("뺄셈 : "+(num1-num2));
			break;
			
		case "*":
			System.out.println("곱셈 : "+(num1*num2));
			break;
		case "/":
			System.out.println("나눗셈 : "+((float)num1/num2));
			break;
			
		default:
			System.out.println("연산자 잘못 입력");
			break;
		}
		
	}
	
	
}

