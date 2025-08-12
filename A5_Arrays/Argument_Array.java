package METHOD;

public class Argument_Array {
    static int addition(int ...arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
       return sum;
    }
     public static void main(String []args){
    System.out.println(addition(6));
    System.out.println(addition(4,5,6,9));
    }
}
