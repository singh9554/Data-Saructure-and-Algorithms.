package Java_Project;
class Library{
    String []books;
    int noOfBook;
    Library(){
       this.books=new String[100];
       this.noOfBook=0;
    }
    public void addBook(String Book){
       for(int i = 0; i < this.books.length; i++){
           if(books[i] == null){
               books[i]=Book;
               System.out.println(Book+" has been added");
               break;
           }
       }

    }
    public void showAvailableBooks(){
        System.out.println("Available Books are : ");
        for(String book:this.books){
            if(book == null){
              continue;
            }
            System.out.println("*"+book);
        }
    }
    public void issueBook(String Book){
        for(int i = 0; i < this.books.length;i++){
            if(this.books[i].equals(Book)){
                System.out.println(Book + " has been issued");
                this.books[i]=null;
                return;
            }
        }
    }
    public void returnBook(String Book){
        //Do this Or directly call add book method because same logic is used;
//        this.books[noOfBook++]=Book;
//        System.out.println(Book+" has bee returned");
        addBook(Book);
    }
}
public class Online_Library {
    public static void main(String[]args){
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library obj = new Library();
        obj.addBook("Think and Grow Rich");
        obj.addBook("Java Zero To Hero");
        obj.addBook("Algorithm");
        obj.addBook("C++");
        System.out.println("------------------------------------------------");
        obj.showAvailableBooks();
        System.out.println("------------------------------------------------");
        obj.issueBook("Algorithm");
        System.out.println("------------------------------------------------");
        obj.showAvailableBooks();
        System.out.println("------------------------------------------------");
        obj.returnBook("Algorithm");
        System.out.println("------------------------------------------------");
        obj.showAvailableBooks();
    }
}
