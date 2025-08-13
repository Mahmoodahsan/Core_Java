package switchCase;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter color name : ");
		char s=sc.next().toLowerCase().charAt(0);
		//with return type only
		String result=switch(s) {
		case 'r' -> "you choosen red color";
		case 'y' -> "you choosen yellow color";
		case 'w' -> "you choosen white color";
		case 'b' -> "you choosen black/blue color";
		case 'p' -> "you choosen pink color";
		case 'g' -> "you choosen green color";
		default  -> "PLZ choose any color";
		};
		System.out.println(result);
		sc.close();
		}
	}
