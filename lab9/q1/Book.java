public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String id, String author, String title, int numPages) {
        super(type, id);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public double calculatePrice() {
        return numPages * 0.5;
    }
}
