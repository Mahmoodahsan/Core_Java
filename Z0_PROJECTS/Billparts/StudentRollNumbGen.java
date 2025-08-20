package Z0_PROJECTS.Billparts;
import java.util.Date;
import java.util.Scanner;
class student{
    private String rollNo;
    private static int count=1;
    private String assignrollNo(){
        Date d=new Date();
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    student(){
        rollNo=assignrollNo();
    }
    public String getRollNo(){
        return rollNo;
    }
}
public class StudentRollNumbGen {
    public static void main(String []args){
           System.out.println("how many students addmission this year N:");
           Scanner sc=new Scanner(System.in);
           int N=sc.nextInt();
           sc.close();
           for(int i=1;i<=N;i++){
            student ob=new student();
            System.out.println(i+":student roll NUMBER"+ob.getRollNo());
           }
    }
}
