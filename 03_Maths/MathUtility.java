package ROUGH;

public class MathUtility {
    // Static method to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // Calling the static method directly using the class name
        int result = MathUtility.square(5);
        System.out.println(square(6)); 
        System.out.println("Square of 5: " + result);
    }
}
