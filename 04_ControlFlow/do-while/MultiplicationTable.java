public class MultiplicationTable {
    public static void main(String[] args) {
        int i = 1;
        int num = 7;

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
