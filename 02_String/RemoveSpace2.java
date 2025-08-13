public class RemoveSpace {
    static String removespace(String str){
        String m="";
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)!=' '){
                m+=str.substring(i,i+1);
            }
            i++;
        }
        return m;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(RemoveSpace.removespace(str));
    }
}