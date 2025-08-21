class CoppyConstuctor {
    String name;
    CoppyConstuctor(String n) {
        name = n;
    }
    CoppyConstuctor(CoppyConstuctor s) {
        name = s.name;
    }
}
public class Main4 {
    public static void main(String[] args) {
        CoppyConstuctor s1 = new CoppyConstuctor("Mahmood");
        CoppyConstuctor s2 = new CoppyConstuctor(s1);
        System.out.println(s2.name);
    }
}
