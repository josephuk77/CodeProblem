package com.home.controller;

import java.util.Scanner;

public class Function 
{
	Scanner sc = new Scanner(System.in);

	public void calculator()
	{
		int num1,num2;
		char ch;
		
		System.out.print("첫번째 정수:");
		num1 =sc.nextInt();
		System.out.print("두번째 정수:");
		num2 = sc.nextInt();
		System.out.print("연산문자:");
		ch = sc.next().charAt(0);
		
		switch(ch) 
		{
			case'+' :
				System.out.println(num1 + " + "+num2 +" = "+ num1+num2);
				break;
			case'-' :
				System.out.println(num1 + " - "+num2 +" = "+ (num1-num2));
				break;
			case'*' :
				System.out.println(num1 + " * "+num2 +" = "+ (num1*num2));
				break;
			case'/' :
				if(num2 == 0)
				{
					System.out.println("0으로 나눌 수 없습니다.");
					System.out.println(num1 + " / "+num2 +" = 0");
				}
				else
					System.out.println(num1 + " / "+num2 +" = "+ (num1/num2));
		}
			
	}
	
	public void totalCalculator()
	{
		int num1,num2;
		int sum=0;
		System.out.print("두 정수를 입력하시오:");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		
		if(num1>num2)
		{
			for(int i = num2;num1>=i;i++)
			{
				sum+=i;
			}
			System.out.println(num2+"부터 "+num1+"까지 정수들의 합계:"+ sum);
		}
		else
		{
			for(int i = num1;num2>=i;i++)
			{
				sum+=i;
			}
			System.out.println(num1+"부터 "+num2+"까지 정수들의 합계:"+ sum);
		}
		
	}
	
	public void profile()
	{
		String name = "이승욱";
		int age = 23;
		String gender = "남자";
		String nature = "소심하다";
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"세");
		System.out.println("성별 : "+gender);
		System.out.println("성격 : "+nature);
	}
	
	
	public void sugjuk()
	{
		String name, gender2;
		int grade, group, number;
		char gender, credit;
		double record;
		System.out.print("학생이름 : ");
		name = sc.nextLine();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("반 : ");
		group = sc.nextInt();
		System.out.print("번호 : ");
		number = sc.nextInt();
		System.out.print("성별(M/F) : ");
		gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		record = sc.nextDouble();
		
		if(record>=90)
			credit ='A';
		else if(record>=80)
			credit = 'B';
		else if(record>=70)
			credit = 'C';
		else if(record>=60)
			credit = 'D';
		else
			credit = 'F';
		gender2 = (gender =='M') ? "남학생" : "여학생";
		 System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고,%c 학점입니다.\n",grade,group,number,name,gender2,record,credit);
	}
	
	 public void printStarNumber()
	 {
		 int num;
		 System.out.print("정수 하나 입력 :");
		 num = sc.nextInt();
		 
		 if (num>0)
		 {
			 for(int i = 0; i<num;i++)
			 {
				 for (int j = 0; j<=i;j++)
				 {
					 if (j == i)
					 {
						 System.out.print(j+1);
					 }
					 else
					 {
						System.out.print("*");
				 
					 }
				 }
				 System.out.println();
			 }
		 }
		 else
			 System.out.println("양수가 아닙니다");
	 }
	 
	 public void sumRandomNumber()
	 {
		 int randomNum;
		 int sum = 0;
		 
		 randomNum = (int) (Math.random() *100 +1);
		 
		 for (int i = 1; i <= randomNum; i++)
		 {
			 sum += i;
		 }
		 
		 System.out.println("임의의 정수 :" + randomNum + "\n1부터 randomNum까지의 합:" + sum);
	 }

	 
	 public void continueGugudan()
	 {
		 int num1, num2;
		 
		 System.out.print("단수 :");
		 num1 = sc.nextInt();
		 System.out.print("제외할 배수");
		 num2 = sc.nextInt();
		 
		 if(num1 <0 || num2<0)
		 {
			 System.out.println("양수가 아닙니다.");
			 return;
		 }
		 else
		 {
		 	for(int i =1; i<=9;i++)
		 	{
		 		if(i == num2)
			 	{
				
		 			break;
			 	}
			 	else
			 	{
				 	System.out.println(num1 + " * " + i +" = " + (i*num1));
			 	}
		 	}
		 }
	 }
	 
	 
	 
	 public void shutNumber()
	 {
		 int dice1, dice2;
		 int sum, choice;
		 char inputNo;
		 
		 do {
			 dice1 = (int)(Math.random()*6+1);
			 dice2 = (int)(Math.random()*6+1);
			 sum = dice1 + dice2;
			 System.out.print("두 주사위의 합은:");
			 choice = sc.nextInt();
			 if (choice == sum)
			 {
				 System.out.println("두 주사위의 합 :" + sum + "\n선택한 수 : " + choice);
				 System.out.println("맞췄습니다.");
			 }
			 else
			 {
				 System.out.println("두 주사위의 합 :" + sum + "\n선택한 수 : " + choice);
				 System.out.println("틀렸습니다.");
			 }
			 
			 System.out.print("계속하시겠습니까?(y/n)");
			 inputNo = sc.next().charAt(0);
		 }while(inputNo != 'n'&&inputNo != 'N');
	 }
}

































