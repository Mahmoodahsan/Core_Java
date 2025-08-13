package switchCase;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner=new Scanner(System.in);
          System.out.println("enter colur name :");
          char ch=scanner.next().toLowerCase().charAt(0);
          switch (ch) {
		case 'r': System.out.println("choose red colour"); break;
		case 'b': System.out.println("choose blue colour"); break;
		case 'y': System.out.println("choose y colour"); break;
		case 'g': System.out.println("choose green colour"); break;
		case 'p': System.out.println("choose pink colour"); break;
		default:System.out.println("choose right one");
		}
          scanner.close();
	}

}