public class DoubleValue {
    public static void doubleIt(int num) {
        num *= 2;
        System.out.println("Inside method: " + num);
    }
    public static void main(String[] args) {
        int n = 10;
        doubleIt(n);
        System.out.println("Outside method: " + n);
    }
}
