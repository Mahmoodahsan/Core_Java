public class Main {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("mahmood ahsan");
        String k=sb.toString();
        char[] CharArray=k.toCharArray();
        int l=CharArray.length;
        String s=" ";
        int i=0;
        while(i<l){
            if(CharArray[i]!=' '){
                s+=CharArray[i];
            }
            i++;
        }
        System.out.println("remove space:"+s);
    }
}