public class ForEachExample2 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        
        for (int n : numbers) {
            sum += n;
        }
        
        System.out.println("Sum = " + sum);
    }
}
