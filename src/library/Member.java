package library;

public class Member {
    private String name;
    private String memberNumber;
    private Book borrowedBook;

    public Member() {
    }

    public Member(String name, String memberNumber) {
        this.name = name;
        this.memberNumber = memberNumber;
    }

    public Member(String name, String memberNumber, Book borrowedBook) {
        this.name = name;
        this.memberNumber = memberNumber;
        this.borrowedBook = borrowedBook;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberNumber='" + memberNumber + '\'' +
                ", borrowedBook=" + borrowedBook +
                '}';
    }
}
