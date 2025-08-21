 class Fact {
    int fact(int f){
        int Fact=1;
        //base condition
        if(f==1 || f==0){
//            System.out.println(1);
            return 1;
        }
        //recursive work
        Fact=f*fact(f-1);
        //final work
       return Fact;
    }
}
public class Factorial {
    public static void main(String[] args) {
       Fact ob= new Fact();
        System.out.println( ob.fact(5));
    }
}