package ch2;

import java.util.Scanner;

public class okane {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("��ǰ�� ������ ���ΰ��� ? :  %n");
		int price = sc.nextInt();
		
		System.out.printf("�ֽ� ���� �Է��ϼ��� :  %n");
		int money = sc.nextInt();
		int sa = money -price ;  // �Ž����� 
		
		System.out.println("----- �Ž����� ���� -------");
		System.out.printf("�� �Ž��� �� : %d %n", sa );
		while(true)
		{
			if(sa/5000>0)
			{
				System.out.printf("5000�� : %d %n", sa/5000 );
				sa= sa % 5000;
			}
			
			else if (sa/1000>0)
			{
				System.out.printf("1000�� : %d %n", sa/1000 );
				sa= sa % 1000;
			}
			
			else if (sa/500>0)
			{
				System.out.printf("500�� : %d %n", sa/500 );
				sa= sa % 500;
			}
			else if (sa/100>0)
			{
				System.out.printf("100�� : %d %n", sa/100 );
				sa= sa % 100;
			}
			else if (sa/10>0)
			{
				System.out.printf("10�� : %d %n", sa/10 );
				sa= sa % 10;
			}
			else
			{
				System.out.printf("1�� : %d %n", sa/1 );
				System.out.println("---------------------");
				break;
			}
		}

	}

}
