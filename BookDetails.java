import java.util.Scanner;

class Books {
    private String bookName, authorName;
    private int bookPrice;
    void getBookName(String bookName) {
        this.bookName = bookName;
    }
    void getAuthorName(String authorName) {
        this.authorName = authorName;
    }
    void getPrice(int price) {
        bookPrice = price;
    }
    void showDetails() {
        System.out.println("Book Detials");
        System.out.println("Book Name:" + bookName);
        System.out.println("Book Price:" + bookPrice);
        System.out.println("Author Name:" + authorName);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books obj = new Books();

        System.out.println("Enter the Book Name:");
        String bookName = sc.next();
        obj.getBookName(bookName);

        System.out.println("Enter the price:");
        int price = sc.nextInt();
        obj.getPrice(price);

        System.out.println("Enter the Author Name:");
        String authorName = sc.next();
        obj.getAuthorName(authorName);

        obj.showDetails();
    }
}
