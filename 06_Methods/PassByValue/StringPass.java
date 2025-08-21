public class StringPass {
    public static void modifyString(String s) {
        s = s + " World";
        System.out.println("Inside method: " + s);
    }
    public static void main(String[] args) {
        String str = "Hello";
        modifyString(str);
        System.out.println("Outside method: " + str);
    }
}
