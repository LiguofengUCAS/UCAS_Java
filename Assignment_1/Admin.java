public class Admin {
    String admin_name;
    int available_books;
    int borrowed_books;

    Admin(String name) {
        admin_name = name;
        available_books = 5;
        borrowed_books = 0;
    }

    void borrow_book() {
        available_books--;
        borrowed_books++;
    }

    void return_book() {
        available_books++;
        borrowed_books--;
    }

    void show_info() {
        System.out.println("Available: " + available_books);
        System.out.println("Borrowed: " + borrowed_books);
        System.out.println("\n");
    }
}
