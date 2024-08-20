package Project;
import java.util.*;
public class Book {
    String author;
    String title;
    String isbn;
    boolean isborrow;
    static int TotalNoOfBook;
    static{
        TotalNoOfBook=0;
    }
    {
        TotalNoOfBook++;
    }
    Book(String author, String title, String isbn){
        this.author= author;
        this.title= title;
        this.isbn= isbn;
    }
   
    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }
    static int getTotalNoOfBooks(){
        return TotalNoOfBook;
    }
    void borrowbook(){
        if (isborrow) {
            System.out.println("Book is already borrowed.");
        }
        else{
            isborrow=true;
            System.out.println("Enjoy "+ this.title);
        }
    }
    void returnbook(){
        if(isborrow){
            this.isborrow=true;
            System.out.println("Please leave the Riview.");
        }
        else{
            System.out.println("This Book is already in the library.");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Book designThings= new Book("Author", "Design", "1");
        Book myBook= new Book ("2");
        System.out.println(Book.getTotalNoOfBooks());
        designThings.borrowbook();
        myBook.borrowbook();
        designThings.borrowbook();
        designThings.returnbook(); 
        designThings.returnbook();
    }
}
