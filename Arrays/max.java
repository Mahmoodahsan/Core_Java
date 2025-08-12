package array;

// public class max {
    
// }
public class max
{ 
 static int ma(int x, int y) 
 {
    int z='=';
 if(x>y) 
 return x; 
 else if(x<y)
 return y; 
 else
 return z;
 } 
}
 class A{
 public static void main(String args[]) 
 { 
 int a=10,b=10,c; 
 //max ob=new max();
 c=max.ma(a,b); 
 System.out.println(c); 
 }
}