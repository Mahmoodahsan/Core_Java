class Second {
    {
        System.out.println("Non-static block1");//2
    }
    {
        System.out.println("Non-static block2");//3
    }
}
public class NSB2 {
    public static void main(String[] args) {
        Second second = new Second();//1
        System.out.println("Main method executed");//4
    }
}