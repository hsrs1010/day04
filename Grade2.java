package com.java.one;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char grade='F';
		
		System.out.println("당신의 점수는 ? (50~100)");
		int score=sc.nextInt();
		
		if(score>=90 && score<=100) {
			grade='A';
			
		}if (score>=80 && score<=89) {
			grade='B';
			
		}if (score>=70 && score<=79) {
			grade='C';
			
		}if (score>=60 && score<=69) {
			grade='D';
			
		}else if (score<60) {
			grade='F';
		}
			
		System.out.println("당신의 학점은 : "+grade);
		
		sc.close();
	}
}