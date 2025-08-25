class Test{
    {
        System.out.println("Non-static block");
    }
}
public class NSB1{
    public static void main(String[] args) {
        new Test();
        new Test();
        new Test();
    }
}