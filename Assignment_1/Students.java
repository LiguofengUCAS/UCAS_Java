public class Students {
    String student_name;
    int student_id;
    int books[] = new int[5];
    int count = 0;

    Students(String name, int id) {
        student_name = name;
        student_id = id;
    }

    void borrow_book(int book_id) {
        if(books_full())
            System.out.println("You can not borrow more books! " +
                    "Please return some of them first.");
        else
            books[count++] = book_id;
    }

    void return_book(int book_id) {
        if(books_empty())
            System.out.println("You have not borrowed any book yet.");
        else {
            int i = 0;
            int out = 0;
            //look for the book need to be returned
            for (; i < count; i++) {
                if (books[i] == book_id) {
                    out = i;
                    break;
                }
            }
            //get the returned book out of the list
            for (i = out; i < count - 1; i++)
                books[i] = books[i + 1];

            count--;
        }
    }

    void show_info() {
        int i;
        System.out.println("Student name: " + student_name);
        System.out.println("Student id:" + student_id);
        System.out.println("Books borrowed:");
        for(i = 0; i< count; i++)
            System.out.println(books[i]);
        System.out.println("\n");
    }

    boolean books_empty() {
        if(count == 0)
            return true;
        else
            return false;
    }

    boolean books_full() {
        if(count == 10)
            return true;
        else
            return false;
    }
}
