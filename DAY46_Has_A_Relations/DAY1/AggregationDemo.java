package DAY46_Has_A_Relation.DAY1;

public class AggregationDemo {
 public static void main(String[] args) {
     College vit = new College("VIT", "Vellore");
     College nit = new College("NIT", "Hyderabad");

     Student s1 = new Student(101, "Ravi", vit);
     Student s2 = new Student(102, "Smith", nit);

     System.out.println(s1);
     System.out.println(s2);
 }
}
