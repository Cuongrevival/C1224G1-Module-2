package Book;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean borrowed = false;
    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();
        if (borrowedBook == null) {
            borrowed = false;
        } else {
            borrowed = true;
        }
    }
    public String getAuthorAndTitle() {
        if (borrowed) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }
    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
