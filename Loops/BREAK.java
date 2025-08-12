public class BREAK{
    public static void main(String args[]){
        int a=1,n=100;
        for(a=2;a<=n;a++){
             if(a==5){
              //jump from this statement and continue 
                continue;
            }
           else if(a==11){
            //stop the pration when it is true and command goes to out of loop
              break;
            }
            System.out.println(a);
        }
    }
}