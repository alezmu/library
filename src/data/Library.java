package data;


public class Library {
    public final static int MAX_BOOK = 1000;
    public final static int MAX_MAGAZINE = 1000;
    private int bookNumber;
    private int magazineNumber;
    private Book[] books;
    private Magazine[] magazines;





    public Library() {
        books = new Book[MAX_BOOK];
        magazines = new Magazine[MAX_MAGAZINE];
        bookNumber = 0;
        magazineNumber = 0;
    }



    public int getBookNumber(){
        return bookNumber;
    }

    public int getMagazineNumber(){
        return magazineNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    public Magazine[] getMagazines() {
        return magazines;
    }

    public void addBook(Book book) {
        if (bookNumber < MAX_BOOK) {
            books[bookNumber] = book;
            bookNumber++;
        } else {
            System.out.println("Przekroczyles limit naszej biblioteki.");
        }

    }
    public void addMagazine(Magazine magazine){
        if ((magazineNumber<MAX_MAGAZINE)){
            magazines[magazineNumber] = magazine;
            magazineNumber++;
        }else {
            System.out.println("Przekroczyles limit naszej biblioteki.");
        }
    }
    public void printBooks(){
    if (bookNumber==0){
        System.out.println("Brak ksiazek w bibliotece");
    }else {
        for (int x = 0; x <bookNumber; x++){
            System.out.println(books[x]);

        }
    }
    }
    public void printMagazines() {
        if(magazineNumber == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
        for(int i=0; i<magazineNumber; i++) {
            System.out.println(magazines[i]);
        }
    }

}