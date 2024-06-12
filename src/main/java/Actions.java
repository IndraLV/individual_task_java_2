import java.util.ArrayList;

public class Actions {

  private ArrayList<Book> books = new ArrayList<Book>();

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(String name) {
    books.removeIf(book -> book.name.equals(name));
  }

  public void getBooks() {
    for (Book book : books) {
      System.out.println(book.name + " by " + book.author);
    }
  }

}