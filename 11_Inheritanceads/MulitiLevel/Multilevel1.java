class First {
    void show() {
        int a = 0, b = 9;
        System.out.println(a + b);
    }
}

class Second extends First {
    void mul() {
        double a = 6.8, b = 7.6;
        System.out.println(a * b);
    }
}

class Shird extends Second {
    void sub() {
        int a = 9, b = 4;
        System.out.println(a - b);
    }
}

public class Multilevel1 {
    public static void main(String args[]) {
        Shird Mak = new Shird();
        Mak.show();
        Mak.mul();
        Mak.sub();
    }
}
