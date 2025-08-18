public class SumOverload {
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
    }
}
