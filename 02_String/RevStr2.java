public class Main {
    public static void main(String[] args) {
       //Using iterative method***
        String s="mahmood";
       char[] str=s.toCharArray();
        System.out.println(str.length);
       for(int i=str.length-1;i>=0;i--){
           System.out.println(str[i]);
       }
    }
}