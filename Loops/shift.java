package all_for_loop;

public class shift {
    public static void main(String args[]){
        int i=0,j=5;
        for(i++,--j;j>0;){
            System.out.println(j>>>i);
            --j;
        }
    }
}
