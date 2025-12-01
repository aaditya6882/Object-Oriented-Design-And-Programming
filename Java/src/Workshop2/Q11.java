package Workshop2;

interface Readable {
	void read();
}

interface Writable {
	void write();
}

class Book implements Readable, Writable {

	@Override
	public void read() {
		System.out.println("Reading the book");
	}

	@Override
	public void write() {
		System.out.println("Writing in the book");
	}
}

public class Q11 {
	public static void main(String[] args) {
		Book book = new Book();
		book.read();
		book.write();
	}
}
