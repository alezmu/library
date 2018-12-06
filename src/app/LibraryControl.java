package app;
import utils.DataReader;
import data.Book;
import data.Magazine;
import data.Library;

import utils.DataReader;

public class LibraryControl {

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
        Option option;
        printOptions();

        while ((option=Option.createFromInt(dataReader.getInt()))!=Option.EXIT){
            switch (option){
                case ADD_BOOK:
                    addBook();
                    break;
                case SHOW_BOOKS :
                    printBooks();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case SHOW_MAGAZINES :
                    printMagazines();
                    break;
                case EXIT:
                    ;
            }
            printOptions();

        }
        dataReader.close();
    }

    private void printOptions(){
        System.out.println("Wybierz opcję: ");
       for (Option o: Option.values()){
           System.out.println(o);
       }
    }

    private void addBook(){

       Book book = dataReader.readAndCreateBook();
       library.addBook(book);

    }

    private void addMagazine(){
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }
    private void printBooks(){
        library.printBooks();
    }

    private void printMagazines(){
        library.printMagazines();
    }


}
