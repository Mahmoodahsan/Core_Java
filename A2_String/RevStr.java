public class Main {
    public static void main(String[] args) {
         String st="MAHMOOD";
         rec ob=new rec();
      //  System.out.println(st.charAt(6));
         for(int i=st.length()-1;i>=0;i--){
             System.out.println(ob.reverse(st,i));
         }
    }
}
class rec{
    char reverse(String st,int i){
        return st.charAt(i);
    }
}