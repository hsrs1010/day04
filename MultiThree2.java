package com.java.one;

import java.util.Scanner;

public class MultiThree2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자입력 : ");
		int num=sc.nextInt();
		if(num%3==0) {
			System.out.println("3의배수입니다.");
		}else if (num%3==1) {
			System.out.println("나머지가 1입니다.");
		}else if (num%3==2) {
			System.out.println("나머지가 2입니다.");
		}
		sc.close();
		}
		
		 
		
		
	}