package Book;

public class Test {
    public static void main(String[] args) {
        System.out.println("TESTING BOOK SINGLETON");
        BookBorrower b = new BookBorrower();
        BookBorrower b2 = new BookBorrower();

        b.borrowBook();
        System.out.println("Book borrower 1 asked to borrow the book");
        System.out.println("Book borrower 1 Author and Title: ");
        System.out.println(b.getAuthorAndTitle());
        b2.borrowBook();
        System.out.println("Book borrower 2 asked to borrow the book");
        System.out.println("Bookborrower 2 Author and Title: ");
        System.out.println(b2.getAuthorAndTitle());
        b.returnBook();
        System.out.println("Bookborrower 1 returned the book");
        b2.borrowBook();
        System.out.println("Bookborrower 2 Author and Title: ");
        System.out.println(b.getAuthorAndTitle());
    }
}
