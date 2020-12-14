public class Books {
    String book_name;
    int book_id;
    boolean status = true; //available
    int student_id = 0; //id 0 means held by none
    int last_student_id = 0;

    Books(String name, int b_id) {
        book_name = name;
        book_id = b_id;
    }

    void borrow_book(int s_id) {
        if(status == true) {
            status = false;
            student_id = s_id;
        }
        else
            System.out.println("Sorry, this book has been borrowed.");
    }

    void return_book() {
        status = true;
        last_student_id = student_id;
        student_id = 0;
    }

    void show_info() {
        System.out.println("Book name: " + book_name);
        System.out.println("Book id: " + book_id);
        System.out.println("Status: " + status);
        System.out.println("Student holding: " + student_id);
        System.out.println("Last holding: " + last_student_id);
        System.out.println("\n");
    }
}
