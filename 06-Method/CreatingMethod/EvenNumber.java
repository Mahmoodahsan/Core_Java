public class EvenNumbers {
    public static void printEven(int limit) {
        for (int i = 2; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printEven(10);
    }
}
