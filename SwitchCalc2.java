package com.java.one;

import java.util.Scanner;

public class SwitchCalc2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//�μ��� �Է�, ������ �Է�
		System.out.println("num1 �Է�");
		int num1=sc.nextInt();
		
		System.out.println("num2 �Է�");
		int num2=sc.nextInt();
		
		//������ �Է�
		System.out.println("������ �Է� (+,/,*,-) : ");
		String oper=sc.next();
		double result = 0;
		//�����ڿ� ���� ���
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
			System.out.println("������ �߸� �Է�");
			break;
		}
		boolean flag=oper.equals("+")|| 
		oper.equals("-")|| oper.equals("*")|| 
		oper.equals("/");
		if(flag) {
		System.out.println(oper+"����� : "+result);
		sc.close();
		}
}
}