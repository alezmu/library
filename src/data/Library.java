package data;


public class Library {
    final static int maxBook = 1000;
    private int bookNumber;
    private Book[] books;

    public Library() {
        books = new Book[maxBook];
        bookNumber = 0;
    }

    public int getBookNumber(){
        return bookNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (bookNumber < maxBook) {
            books[bookNumber] = book;
            bookNumber++;
        } else {
            System.out.println("Przekroczyles limit naszej biblioteki.");
        }

    }
    public void printBooks(){
    if (bookNumber==0){
        System.out.println("Brak ksiazek w bibliotece");
    }else {
        for (int x = 0; x <bookNumber; x++){
            books[x].printInfo();
        }
    }
    }

}