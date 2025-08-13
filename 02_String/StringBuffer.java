public class Main {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("mahmood");
        System.out.println("reverse of mahmood"+sb.reverse());
        System.out.println(sb.append(" ahsan"));
        System.out.println(sb.capacity());
        System.out.println(sb.replace(2,8,"str"));
        System.out.println(sb);
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.delete(2,9));
        String s=sb.toString();
        char[] CharArray=s.toCharArray();
    }
}