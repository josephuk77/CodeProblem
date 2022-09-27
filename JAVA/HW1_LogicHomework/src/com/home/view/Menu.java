package com.home.view;
import java.util.Scanner;

import com.home.controller.Function;

public class Menu 
{
	public static void displayMenu()
	{
		int input;
		Function ft = new Function(); 
		
		do {
			
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3.신상정보 확인하기");
			System.out.println("4.학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합게 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력:");
			input = new Scanner(System.in).nextInt();
			
			if(input==1)
			{
				ft.calculator();
			}
			else if(input == 2)
			{
				ft.totalCalculator();
			}
			else if(input == 3)
			{
				ft.profile();
			}
			else if(input == 4)
			{
				ft.sugjuk();
			}
			else if(input == 5)
			{
				ft.printStarNumber();
			}
			else if(input == 6)
			{
				ft.sumRandomNumber();
			}
			else if(input == 7)
			{
				ft.continueGugudan();
			}
			else if(input == 8)
			{
				ft.shutNumber();
			}
			
			
			
		}while(input != 9);
	}

}
