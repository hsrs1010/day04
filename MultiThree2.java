package com.java.one;

import java.util.Scanner;

public class MultiThree2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		int num=sc.nextInt();
		if(num%3==0) {
			System.out.println("3�ǹ���Դϴ�.");
		}else if (num%3==1) {
			System.out.println("�������� 1�Դϴ�.");
		}else if (num%3==2) {
			System.out.println("�������� 2�Դϴ�.");
		}
		sc.close();
		}
		
		 
		
		
	}