class BasicGetterSetter {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class Main1 {
    public static void main(String[] args) {
        BasicGetterSetter s = new BasicGetterSetter();
        s.setName("Mahmood");
        System.out.println(s.getName());
    }
}
