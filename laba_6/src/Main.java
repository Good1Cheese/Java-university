import java.time.LocalDate;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		TestBooks();

		LibraryHaspMapAdd();
		LibraryHaspMapRemove();
		LibraryHaspMapFind();

		LibraryTreeSetAdd();
		LibraryTreeSetRemove();
		LibraryTreeSetFind();
	}

	public static void TestBooks() {
		out.println("\n*** BOOKS GENERIC ***\n");

		var bk1 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());
		out.println(bk1.toString());
		out.println(bk1.hashCode());

		var bk1_same_1 = bk1;
		var bk1_same_2 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());

		var bk2 = new Book("Not Test", "Misha", "9782123456635", LocalDate.MIN);

		out.println(bk1.equals(bk1_same_1));
		out.println(bk1.equals(bk1_same_2));
		out.println(bk1.equals(bk2));
	}

	public static void LibraryTreeSetAdd() {
		out.println("\n*** TreeSet ADD ***\n");

		var bk1 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());
		var bk2 = new Book("Not Test", "Misha", "9782123456635", LocalDate.MIN);
		var bk3 = new Book("Not Test 2", "Misha", "9782123456606", LocalDate.MIN);
		var lb = new Library();

		lb.addBook(bk1);
		lb.addBook(bk2);
		lb.addBook(bk3);

		lb.printTreeSet();
	}

	public static void LibraryTreeSetRemove() {
		out.println("\n*** TreeSet REMOVE ***\n");

		var bk1 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());
		var bk2 = new Book("Not Test", "Misha", "9782123456635", LocalDate.MIN);
		var lb = new Library();

		lb.addBook(bk1);
		lb.addBook(bk2);
		lb.removeBook(bk1);

		lb.printTreeSet();
	}

	public static void LibraryTreeSetFind() {
		out.println("\n*** TreeSet FIND ***\n");

		var bk1 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());
		var bk2 = new Book("Test", "Pavel", "9782123456799", LocalDate.now());
		var bk3 = new Book("Test", "Pavel", "9782123456781", LocalDate.now());
		var lb = new Library();

		lb.addBook(bk1);
		lb.addBook(bk2);
		lb.addBook(bk3);

		var res = lb.findBooksByTitle(bk1.getTitle());
		out.println(res);
	}

	public static void LibraryHaspMapAdd() {
		out.println("\n*** HaspMap ADD ***\n");

		var bk1 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());
		var bk2 = new Book("Not Test", "Misha", "9782123456635", LocalDate.MIN);
		var lb = new Library();

		lb.addBook(bk1);
		lb.addBook(bk2);

		lb.printHashMap();
	}

	public static void LibraryHaspMapRemove() {
		out.println("\n*** HaspMap REMOVE ***\n");

		var bk1 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());
		var bk2 = new Book("Not Test", "Misha", "9782123456635", LocalDate.MIN);
		var lb = new Library();

		lb.addBook(bk1);
		lb.addBook(bk2);
		lb.removeBook(bk1);

		lb.printHashMap();
	}

	public static void LibraryHaspMapFind() {
		out.println("\n*** HaspMap FIND ***\n");

		var bk1 = new Book("Test", "Pavel", "9782123456803", LocalDate.now());
		var lb = new Library();

		lb.addBook(bk1);

		var res = lb.findBookByIsbn(bk1.getIsbn());
		out.println(res);
	}
}
