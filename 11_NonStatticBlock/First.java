 class First {
    {
        System.out.println("Non-static block1");
    }
    {
        System.out.println("Non-static block2");
    }
}
public class Solution {
    public static void main(String[] args) {
        First first = new First();
        System.out.println("Main method executed");
    }
}