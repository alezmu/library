package app;
import utils.DataReader;
import data.Book;
import data.Magazine;
import data.Library;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

import utils.DataReader;
import utils.LibraryUtils;

public class LibraryControl {

    // zmienna do komunikacji z użytkownikiem
    private DataReader dataReader;

    // "biblioteka" przechowująca dane
    private Library library;
    private LibraryUtils libraryU;

    public LibraryControl(){
        dataReader = new DataReader();
        library = new Library();
        libraryU = new LibraryUtils();
    }
    /*
    * Glowna petla programu ktora pozwala na wybor opcji i interakcje z uzytkownikiem
    * */
    public void controlLoop(){
        Option option;
        printOptions();

        while ((option=Option.createFromInt(dataReader.getInt()))!=Option.EXIT){
            try{switch (option){
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
            }}catch(InputMismatchException e){
                System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
            }catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
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
        libraryU.printBooks(library);
    }

    private void printMagazines(){
        libraryU.printMagazines(library);
    }


}
