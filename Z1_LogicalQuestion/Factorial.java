public class Factorial {
    int fact(int f){
        int factorial=1;
        //base condition
        if(f==1 || f==0){
//            System.out.println(1);
            return 1;
        }
        //recursive work
        factorial=f*fact(f-1);
        //final work
       return factorial;
    }
}
public class Main {
    public static void main(String[] args) {
       Factorial ob= new Factorial();
        System.out.println( ob.fact(5));
    }
}