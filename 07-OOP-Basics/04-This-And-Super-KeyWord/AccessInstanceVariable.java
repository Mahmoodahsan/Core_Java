class AccessInstanceVariable {
    int x = 10;
    void show() {
        int x = 20;
        System.out.println(this.x);
    }
}
public class Main5 {
    public static void main(String[] args) {
        new AccessInstanceVariable().show();
    }
}
