public class Book {
    public int bookId;
    public String title;
    public String author;
    public boolean isIssued;


    Book(int bookId, String title, String author){

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }


}
