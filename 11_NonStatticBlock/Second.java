class Second {
    {
        System.out.println("Non-static block1");//1
    }
    {
        System.out.println("Non-static block2");//2
    }
    public Second() {
        System.out.println("Constructor called");//3
    }
}
public class Solution {
    public static void main(String[] args) {
        Second second = new Second();
        System.out.println("Main method executed");//4
    }
}