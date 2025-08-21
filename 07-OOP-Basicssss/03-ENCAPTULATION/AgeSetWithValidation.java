class AgeSetWithValidation {
    private int age;
    public void setAge(int age) {
        if (age > 0) this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class Main2 {
    public static void main(String[] args) {
        AgeSetWithValidation p = new AgeSetWithValidation();
        p.setAge(25);
        System.out.println(p.getAge());
    }
}
