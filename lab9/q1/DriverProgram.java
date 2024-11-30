public class DriverProgram {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];

        Book book = new Book("book", "b001", "j.k. rowling", "harry potter", 300);
        CD cd = new CD("cd", "c001", "the beatles", "abbey road", 10);

        items[0] = book;
        items[1] = cd;

        for (LibraryItem item : items) {
            System.out.println("type: " + item.getType());
            System.out.println("id: " + item.getId());

            if (item instanceof LoanItem) {
                System.out.println("price: $" + ((LoanItem) item).calculatePrice());
            }
            System.out.println();
        }
    }
}
