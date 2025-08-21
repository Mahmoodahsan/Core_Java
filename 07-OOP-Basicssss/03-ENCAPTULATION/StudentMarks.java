class StudentMarks {
    private int marks;
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
}
public class Main5 {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.setMarks(95);
        System.out.println(s.getMarks());
    }
}
