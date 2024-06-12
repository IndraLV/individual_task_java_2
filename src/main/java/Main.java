/* 
Develop a simple book management application with ArrayList.
User should be able to add a book to ArrayList.
User should be able to remove a book from ArrayList.

Easy: Work with String in ArrayList. All the actions should be available for user.

Medium: Work with String User should be able to repeat all the actions infinitely.

Hard: Create a Book class and work with Book object to the ArrayList.
  */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static Actions bookManager = new Actions();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    bookManager.getBooks();

    System.out.println("What would you like to do?");
    System.out.println("(1) Add a book");
    System.out.println("(2) Remove a book");
    System.out.println("(3) Get all books");
    System.out.println("(4) Exit");

    while (true) {

      System.out.print("Enter your choice: ");
      var choice = scanner.nextLine();

      if (choice.equals("4")) {
        break;
      } else if (choice.equals("3")) {
        bookManager.getBooks();
      } else if (choice.equals("1")) {
        System.out.print("Enter the name of the book: ");
        var name = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        var author = scanner.nextLine();
        var book = new Book(name, author);
        bookManager.addBook(book);
      } else if (choice.equals("2")) {
        System.out.print("Enter the name of the book: ");
        var name = scanner.nextLine();
        bookManager.removeBook(name);
      }
    }

  }
}
