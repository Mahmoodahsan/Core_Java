class Father{
    public void house(){
        System.out.println("This is the father's house.");
    }
}
class son extends Father{
    public void car(){
        System.out.println("This is the son's car.");
    }
}
public class SingleLevelInheritance1{
    public static void main(String[] args) {
        son s = new son();
        s.house();
        s.car();
    }
}