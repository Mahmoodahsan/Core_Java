class Sample {
    {
        System.out.println(a);//3
    }
/*if it is not static then it will give compilation error
because upper NSB is non-static and it shows a is not defined*/
   static int a=6;//2
    {
        System.out.println(a);//4
    }
}
public class NSB5 {
    public static void main(String[] args) {
        new Sample();//1
        //
    }
}