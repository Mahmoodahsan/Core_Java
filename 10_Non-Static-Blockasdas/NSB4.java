class Sample {
    public Sample() {
        this("Java");
        System.out.println("No argument constructor");
    }
    public Sample(String language) {
        System.out.println("Language is :" + language);
    }
    {
        System.out.println("Non-static block");
    }
}
public class NSB4 {
    public static void main(String[] args) {
        new Sample();
    }
}