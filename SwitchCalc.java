package com.java.one;

import java.util.Scanner;

public class SwitchCalc {
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
		
		//�����ڿ� ���� ���
		switch (oper) {
		case "+":
			System.out.println("���� : "+(num1+num2));
			break;

		case "-":
			System.out.println("���� : "+(num1-num2));
			break;
			
		case "*":
			System.out.println("���� : "+(num1*num2));
			break;
		case "/":
			System.out.println("������ : "+((float)num1/num2));
			break;
			
		default:
			System.out.println("������ �߸� �Է�");
			break;
		}
		
	}
	
	
}

