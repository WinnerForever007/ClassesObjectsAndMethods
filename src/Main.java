import library.*;
import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book1", "Author1", 2000);
        Book book2 = new Book();
        Member member1 = new Member();
        member1.setBorrowedBook(book1);
        System.out.println(member1);

        Bird bird1 = new Bird();
        bird1.sing();

        Person johnny = new Person("Johnny", "Smith",
                LocalDate.of(2000, 11, 1));
        Person amy = new Person();
        System.out.format("The person's first name is %s%n", johnny.getFirstName());
        johnny.setLastName("smith");
        System.out.printf("The person's last name is %s%n", johnny.getLastName());
        Order order = new Order();
        order.printTotal(100);
        Car car1 = new Car("BMW", "X5", 2015);
        car1.getModel();
        car1.getYear();
    }
}
