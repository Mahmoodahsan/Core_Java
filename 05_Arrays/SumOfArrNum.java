class Sum{
    int sum=0;
    int summariser(int[] arr){
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Sum ob=new Sum();
        System.out.println(ob.summariser(arr));
    }
}