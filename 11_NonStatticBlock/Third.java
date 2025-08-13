class Third {
    {
        System.out.println("Non-static block1");//1
    }
     public Third() {
        System.out.println("Constructor called");//3
    }
    {
        System.out.println("Non-static block2");//2
    }
   
}
public class Solution {
    public static void main(String[] args) {
        Third third = new Third();
        System.out.println("Main method executed");//4
    }
}