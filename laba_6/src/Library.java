import java.util.HashMap;
import static java.lang.System.out;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Library {
	private HashMap<String, Book> booksByIsbn = new HashMap<String, Book>();
	private TreeSet<Book> booksByTitle = new TreeSet<Book>();

	public void addBook(Book bk) {
		booksByIsbn.put(bk.getIsbn(), bk);
		booksByTitle.add(bk);
	}

	public void removeBook(Book bk) {
		booksByIsbn.remove(bk.getIsbn(), bk);
		booksByTitle.remove(bk);
	}

	public Book findBookByIsbn(String key) {
		// Optional, т.к. результата может и не быть, вот и думайте...
		Optional<Book> result = booksByIsbn.entrySet().stream()
				.filter(e -> e.getKey().equals(key))
				.map(Map.Entry::getValue)
				.findFirst();

		return result.isPresent() ? result.get() : null;
	}

	public Set<Book> findBooksByTitle(String key) {
		return booksByTitle.stream()
				.filter(b -> b.getTitle() == key)
				.collect(Collectors.toSet());
	}

	public void printHashMap() {
		for (Map.Entry<String, Book> item : booksByIsbn.entrySet()) {
			out.printf("Key: %s\n%s \n\n", item.getKey(), item.getValue());
		}
	}

	public void printTreeSet() {
		for (Book book : booksByTitle) {
			out.printf("%s\n\n", book);
		}
	}
}