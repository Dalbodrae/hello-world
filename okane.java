package ch2;

import java.util.Scanner;

public class okane {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("물품의 가격은 얼마인가요 ? :  %n");
		int price = sc.nextInt();
		
		System.out.printf("주실 돈을 입력하세요 :  %n");
		int money = sc.nextInt();
		int sa = money -price ;  // 거스름돈 
		
		System.out.println("----- 거스름돈 내역 -------");
		System.out.printf("총 거스름 돈 : %d %n", sa );
		while(true)
		{
			if(sa/5000>0)
			{
				System.out.printf("5000원 : %d %n", sa/5000 );
				sa= sa % 5000;
			}
			
			else if (sa/1000>0)
			{
				System.out.printf("1000원 : %d %n", sa/1000 );
				sa= sa % 1000;
			}
			
			else if (sa/500>0)
			{
				System.out.printf("500원 : %d %n", sa/500 );
				sa= sa % 500;
			}
			else if (sa/100>0)
			{
				System.out.printf("100원 : %d %n", sa/100 );
				sa= sa % 100;
			}
			else if (sa/10>0)
			{
				System.out.printf("10원 : %d %n", sa/10 );
				sa= sa % 10;
			}
			else
			{
				System.out.printf("1원 : %d %n", sa/1 );
				System.out.println("---------------------");
				break;
			}
		}

	}

}
