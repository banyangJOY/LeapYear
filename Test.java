
import java.util.Scanner;
/**
�ж�һ������Ƿ�Ϊ���ꡣ
���꣺1988
���꣺1992
���꣺1996
���꣺2000
���꣺2004
���꣺2008
���꣺2012
���꣺2016
���꣺2020
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		for(int year=1987;year<= 2020;year++){
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				System.out.println("���꣺"+year);
			}
		}
	
	}
}