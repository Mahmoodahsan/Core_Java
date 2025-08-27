public class ForEachExample4 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34};
        int max = numbers[0];
        
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        
        System.out.println("Maximum = " + max);
    }
}
