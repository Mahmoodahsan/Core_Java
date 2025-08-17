package day1;
class Book{
	private String title;
	private String author;
	private double price;
	private Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	//static factory design pattern
	public static Book getBookObject() {
		return new Book("java","James Gosling",1500);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Book b1=Book.getBookObject();
     System.out.println(b1);
	}

}