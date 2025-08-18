package single_level_inheritance;

class Super{
    private int x;
    private int y;
    public void setDate(int x,int y){
         this.x=x;
         this.y=y;
    }
     public int getX(){
        return x;
     }
     public int getY(){
        return y;
     }
}
class Sub extends Super{
    public void showData(){
        System.out.println("X value is : " + this.getX());
        System.out.println("Y value is : " + this.getY());
    }
}

public class SingleLevelInheritance2 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
  Sub sub=new Sub();
  sub.setDate(100,200);
  sub.showData();
}

}