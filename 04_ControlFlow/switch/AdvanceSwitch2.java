public class AdvanceSwitch2 {
	public static void main(String[] args) {
//  type 2 with yield
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter color name :");
    char ch=scanner.next().toLowerCase().charAt(0);
    String result=switch (ch) {
	case 'r' ->{System.out.println("red color");
	   yield "red return";
	}
	case 'b' ->{System.out.println("blue color");
	   yield "blue return";
	}
	case 'g' ->{System.out.println("green color");
	   yield "green return";
	}
	case 'y' ->{System.out.println("yellow color");
	   yield "yellow return";
	}
       default ->"def";
	};
	System.out.println(result);
          scanner.close();
	}
}
