interface Exam {
    void showMarks();
}

interface Sports {
    void showSportsScore();
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Student Name: " + name);
    }
}

class Result extends Student implements Exam, Sports {
    int marks;
    int sportsScore;

    public Result(String name, int marks, int sportsScore) {
        super(name);
        this.marks = marks;
        this.sportsScore = sportsScore;
    }

    public void showMarks() {
        System.out.println("Academic Marks: " + marks);
    }

    public void showSportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }

    public void finalResult() {
        System.out.println("Total Score: " + (marks + sportsScore));
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        Result r = new Result("Alice", 85, 15);
        r.showName();
        r.showMarks();
        r.showSportsScore();
        r.finalResult();
    }
}
