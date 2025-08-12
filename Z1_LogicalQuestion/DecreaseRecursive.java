public class Numb {
    void num(int n){
        //base condition
        if(n==1){
            System.out.println(n);
            return;
        }
        //self work
        System.out.println(n);
        //recursive work

        num(n-1);
    }
}
public class Main {
    public static void main(String[] args) {
        Numb ob=new Numb();
        ob.num(10);
    }
}