public class PassByValue {
    public static void changeValue(int a) {
        a = a + 10;
        System.out.println("Inside method: " + a);
    }
    public static void main(String[] args) {
        int x = 5;
        changeValue(x);
        System.out.println("Outside method: " + x);
    }
}
