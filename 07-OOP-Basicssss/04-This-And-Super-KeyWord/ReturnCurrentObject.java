class ReturnCurrentObject {
    ReturnCurrentObject getObject() {
        return this;
    }
}
public class Main3 {
    public static void main(String[] args) {
        ReturnCurrentObject s = new ReturnCurrentObject();
        System.out.println(s.getObject());
    }
}
