package STRING;

public class CountSameWord {
    public static int count(String s, String target) {
        int count = 0;
        int n = target.length();
        System.out.println(n);
        System.out.println(s.length());
        System.out.println(s.length()-n);
        for (int i = 0; i <= s.length()-n; i++) {
        String piece = s.substring(i, i + n);
        if (piece.equals(target)) count++;
        }
        return count;
} 
public static void main(String[] args) {
    System.out.println("Number of this is: " +
    count("this and this and that and this ththis", "this"));
    }
}