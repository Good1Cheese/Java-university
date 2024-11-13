import java.time.LocalDate;
import java.util.Objects;

public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private String isbn;
	private LocalDate yearPublished;

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public long getIsbnNumeric() {
		return Long.valueOf(isbn);
	}

	public LocalDate getYearPublished() {
		return yearPublished;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setYearPublished(LocalDate yearPublished) {
		this.yearPublished = yearPublished;
	}

	public Book(String title, String author, String isbn, LocalDate yearPublished) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.yearPublished = yearPublished;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || !(o instanceof Book))
			return false;

		var book = (Book) o;
		return Objects.equals(title, book.getTitle())
				&& Objects.equals(author, book.getAuthor())
				&& Objects.equals(isbn, book.getIsbn())
				&& Objects.equals(yearPublished, book.getYearPublished());
	}

	@Override
	public String toString() {
		return String.format(
				"Title - %s;\nAuthor - %s;\nISBN: %s;\nYear Published: %s",
				title, author, isbn, yearPublished);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, author, isbn, yearPublished);
	}

	@Override
	public int compareTo(Book bk) {
		return Math.toIntExact(
				getIsbnNumeric() - bk.getIsbnNumeric());
	}
}
