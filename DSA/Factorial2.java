class rain{
   public static int factorial(int n){
       int fac;
      if(n==1 || n==0){
         return 1;
      }
      else {
        fac=n*factorial(n-1);

      }
      return fac;
    }
}
public class Main {
    public static void main(String[] args) {
        int k=4;
        System.out.println(rain.factorial(k));
    }
}