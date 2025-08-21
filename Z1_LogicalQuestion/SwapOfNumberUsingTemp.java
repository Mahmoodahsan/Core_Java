class Swap{
    static void using_temp(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
public class SwapOfNumberUsingTemp {
    public static void main(String[] args) {
       int a=5;
       int b=7;
        System.out.println(a+" "+b);
        Swap.using_temp(a,b);
    }
}