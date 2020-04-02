package com.java.one;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char grade;
		
		System.out.println("당신의 점수는 ? (50~100)");
		int score=sc.nextInt();
		if(score>=90) {
			grade='A';
		}else if (score>=80) {
			grade='B';
		}else if (score>=70) {
			grade='C';
		}else if (score>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("당신의 학점은 : "+grade);
		
		//switch 추가
		
		switch (grade) {// A B C D F
		case 'A':
			System.out.println("90~100");
			break;
		case 'B':
			System.out.println("80~89");
			break;
		default:
			System.out.println("0~79점입니다.");
			break;
		}
		
		
		sc.close();
	}
}