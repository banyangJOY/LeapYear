
import java.util.Scanner;
/**
判断一个年份是否为闰年。
闰年：1988
闰年：1992
闰年：1996
闰年：2000
闰年：2004
闰年：2008
闰年：2012
闰年：2016
闰年：2020
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		for(int year=1987;year<= 2020;year++){
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				System.out.println("闰年："+year);
			}
		}
	
	}
}