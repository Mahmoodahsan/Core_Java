package DAY46_Has_A_Relation.DAY1;

public class Student {
 private int studentId;
 private String studentName;
 private College college; // HAS-A relationship

 public Student(int studentId, String studentName, College college) {
     this.studentId = studentId;
     this.studentName = studentName;
     this.college = college;
     System.out.println(college);
 }

 @Override
 public String toString() {
     return "Student [studentId=" + studentId + ", studentName=" + studentName + ", college=" + college + "]";
 }
}

