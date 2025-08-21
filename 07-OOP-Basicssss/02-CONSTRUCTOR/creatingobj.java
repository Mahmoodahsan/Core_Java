package Constructor;
public class creatingobj {
    int age;
    String name;
    creatingobj(int age){
        System.out.println("i m in o reference method");
        this.age=age;
    }
    creatingobj(int age,String name){
        this.age=age;
        this.name=name;
System.out.println("i am in 2 references");
    }
    // public static void main(String args[]){
    // creatingobj ob=new creatingobj();
    // }
}
 class A{
public static void main(String args[]){
    creatingobj obj=new creatingobj(9);
    creatingobj ob2=new creatingobj(5,"mahmood");
    System.out.println(ob2.age);
    System.out.println(ob2.name);
    System.out.println(obj.age);
}
}