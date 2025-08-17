class Third {
    {
        System.out.println("Non-static block1");//2
    }
     public Third() {
        System.out.println("Constructor called");//4
    }
    {
        System.out.println("Non-static block2");//3
    }
   
}
public class NSB3 {
    public static void main(String[] args) {
        Third third = new Third();//1
        System.out.println("Main method executed");//5
    }
}