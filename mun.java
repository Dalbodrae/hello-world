package ch2;
import java.util.Scanner;
public class mun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��Ͻÿ� : %n" );
		
		String str = sc.nextLine();
		ch = str.charAt(0);
		
		if ('0' <= ch && ch <= '9') 
		{
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ� %n");
		}
		
		if ( ('a' <= ch && ch <= 'z') ||  ('A' <= ch && ch <= 'Z') ) 
		{
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ� %n");
		}
		
		
				
	}

}
