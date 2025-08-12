package array;

// Class that contains the array 
class ArrayHolder { 
    private int[] numbers = {1, 6, 3, 4, 5}; 
 
    // Getter method to access the array 
    public int[] getNumbers() { 
        return numbers; 
    } 
} 
 
// Class that accesses the array 
public class ArrayAccessor{ 
    public static void main(String[] args) { 
        // Create an instance of ArrayHolder 
        ArrayHolder arrayHolder = new ArrayHolder(); 
 
        // Access the array using the getter method 
        int[] k = arrayHolder.getNumbers(); 
 
        // Print the array elements 
        for (int number : k) { 
            System.out.println(number); 
        } 
    } 
} 