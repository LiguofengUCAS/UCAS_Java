public class TestBooks {

    public static void main(String[] args) {
        Students student_1 = new Students("lgf", 2018);
        student_1.borrow_book(101);
        student_1.borrow_book(122);
        student_1.borrow_book(301);
        student_1.return_book(122);
        student_1.show_info();

        Books book_1 = new Books("JAVA: From Door to Dirt", 2233);
        book_1.borrow_book(2017);
        book_1.show_info();
        book_1.return_book();
        book_1.show_info();

        Admin admin_1 = new Admin("fgl");
        admin_1.borrow_book();
        admin_1.borrow_book();
        admin_1.return_book();
        admin_1.show_info();
    }
}
