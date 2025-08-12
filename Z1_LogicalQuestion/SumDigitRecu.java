 class SumDigit {
    int add(int n){
        if(n>=0 && n<9){
            return n;
        }
        return add(n/10)+add(n%10);
    }
}
public class Main {
    public static void main(String[] args) {
        SumDigit ob=new SumDigit();
        System.out.println(ob.add(1234));
    }
}