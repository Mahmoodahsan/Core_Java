 class Sum {
    int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
public class Main {
    public static void main(String[] args) {
        Sum ob=new Sum();
        System.out.println(ob.sum(10));
    }
}