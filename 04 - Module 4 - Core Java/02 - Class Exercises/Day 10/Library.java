public class Library {
	public static void main(String[] args) {
		// Display all Books
		for(Book book : Book.values()) {
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Publisher: " + book.getPublisher());
			System.out.println();
		}
		
		// Display a Range of Books
		System.out.println("Display Books using Enum Constants");
		for(Book book : java.util.EnumSet.range(Book.Book06, Book.Book11)) {
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Publisher: " + book.getPublisher());
			System.out.println();
		}
	}
}