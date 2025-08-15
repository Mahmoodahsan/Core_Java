public class SwapFail {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int x = 5, y = 10;
        swap(x, y);
        System.out.println("x: " + x + ", y: " + y);
    }
}
