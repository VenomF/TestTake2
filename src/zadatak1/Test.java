package zadatak1;

public class Test {

	public static void main(String[] args) {
		Author author=new Author("Mesa Selimovic", "mesa@afterlife.com", 'M');
		Book book=new Book("Tvrdjava", author, 49.99, 150);
		System.out.println(book.toString());

	}

}
