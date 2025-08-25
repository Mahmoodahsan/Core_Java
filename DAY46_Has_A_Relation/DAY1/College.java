package DAY46_Has_A_Relation.DAY1;

public class College {
 private String collegeName;
 private String location;

 public College(String collegeName, String location) {
     this.collegeName = collegeName;
     this.location = location;
 }

 @Override
 public String toString() {
     return "College [collegeName=" + collegeName + ", location=" + location + "]";
 }
}
