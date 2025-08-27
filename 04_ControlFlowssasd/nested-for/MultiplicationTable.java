public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {           // Outer loop for numbers
            for (int j = 1; j <= 10; j++) {      // Inner loop for multiples
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
