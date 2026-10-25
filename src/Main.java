import library.*;
import model.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book1", "Author1", 2000);
        Book book2 = new Book();
        Member member1 = new Member();
        member1.setBorrowedBook(book1);
        System.out.println(member1);

        Bird bird1 = new Bird();
        bird1.sing();
    }
}
