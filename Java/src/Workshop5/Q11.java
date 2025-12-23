package Workshop5;

import java.util.ArrayList;
import java.util.List;

class Library {
	private List<Book> books;

	public Library(List<Book> books) {
		this.books = books;
	}

	public void showBooks() {
		for (Book b : books) {
			b.showTitle();
		}
	}
}

class Book {
	private String title;

	public Book(String title) {
		this.title = title;
	}

	public void showTitle() {
		System.out.println("Book: " + title);
	}
}

public class Q11 {
public static void main(String[] args) {
	Book b1=new Book("Math");
	Book b2 =new Book("AI");
	List <Book> bookList=new ArrayList<>();
	bookList.add(b1);
	bookList.add(b2);
	Library library=new Library(bookList);
	library.showBooks();
	library=null;
	b1.showTitle();
	b2.showTitle();
	
}
}
