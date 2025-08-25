class Sample {
   private double balance;
   {
       balance=400;
       System.out.println(this.balance+" "+balance);
   }
   {
       balance=500;
       System.out.println(this.balance+" "+balance);
   }
   {
       balance=600;
       System.out.println(this.balance+" "+balance);
   }
   
}
public class NSB6 {
    public static void main(String[] args) {
        new Sample();
        //
    }
}