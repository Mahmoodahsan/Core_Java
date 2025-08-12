		import java.util.Scanner;
		public class BASICS{
		public static void main(String args[]){
		System.out.println("enter number of object you want to create");
		Scanner sc = new Scanner(System.in);
			int noOfObjects = sc.nextInt();
			for(int i=0;i<noOfObjects;i++) {
				Student a = Student.createStudentObject();
				System.out.println(a);
			}
			sc.close();
		}
		
	}
	 class Student{
		private String name;
	    private int age;
	    private String grade;      
	  public Student(String name, int age, String grade) {
			super();
			this.name = name;
			this.age = age;
			this.grade = grade;
		}
	  @SuppressWarnings("resource")
	public static Student createStudentObject() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = Integer.parseInt(sc.nextLine());
		String grade = sc.nextLine();
		return new Student(name,age,grade);
		
	}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
		}
	}