package app;
import utils.DataReader;
import data.Book;
import data.Library;

import utils.DataReader;

public class LibraryControl {
    public final static int  exit = 0;
    public final static int  addBook = 1;
    public final static int  printBooks = 2;

    // zmienna do komunikacji z użytkownikiem
    private DataReader dataReader;

    // "biblioteka" przechowująca dane
    private Library library;

    public LibraryControl(){
        dataReader = new DataReader();
        library = new Library();
    }
    /*
    * Glowna petla programu ktora pozwala na wybor opcji i interakcje z uzytkownikiem
    * */
    public void controlLoop(){
        int option;
        printOptions();

        while ((option=dataReader.getInt())!=exit){
            switch (option){
                case addBook:
                    addBook();
                    break;
                case printBooks :
                    printBooks();
                    break;
                    default:
                        System.out.println("Nie ma takiej opcji, wybierz opcje ponownie: ");
            }
            printOptions();

        }
        dataReader.close();
    }

    private void printOptions(){
        System.out.println("Wybierz opcję: ");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl dostępne książki");
    }

    private void addBook(){

       Book book = dataReader.readAndCreateBook();
       library.addBook(book);

    }
    private void printBooks(){
        library.printBooks();
    }


}
