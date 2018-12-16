package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import data.Book;
import data.Magazine;

public class DataReader {

    private Scanner sc;

    public DataReader(){
        sc = new Scanner(System.in);
    }

    public void close(){
        sc.close();
    }
    public int getInt()throws NumberFormatException{
        int number = 0;
        try {
             number = sc.nextInt();
        }catch (InputMismatchException e){
            throw  new NumberFormatException("Liczba wprowadzona w niepoprawnej formie");
        }
        finally {
            sc.nextLine();
        }
        return number;
    }

    public Book readAndCreateBook()throws InputMismatchException{
        System.out.println("Tytul: ");
        String title =sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictowo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = 0;
        int pages =0;
        try {
            year = sc.nextInt();
            sc.nextLine();
            System.out.println("Ilosc stron: ");
            pages = sc.nextInt();
            sc.nextLine();
        }catch (InputMismatchException e){
            sc.nextLine();
            throw e;
        }


        return new Book(title, author, year, pages, publisher, isbn);
    }


    public Magazine readAndCreateMagazine()throws InputMismatchException{
        System.out.println("Tytul: ");
        String title =sc.nextLine();
        System.out.println("Wydawnictowo: ");
        String publisher = sc.nextLine();
        System.out.println("Jezyk: ");
        String language = sc.nextLine();

        int day = 0;
        int month = 0;
        int year = 0;
        try{
        System.out.println("Dzien wydania: ");
        day = sc.nextInt();
        sc.nextLine();
        System.out.println("Miesiac wydania: ");
        month = sc.nextInt();
        sc.nextLine();
        System.out.println("Rok wydania: ");
        year = sc.nextInt();
        sc.nextLine();}
        catch (InputMismatchException e){
            sc.nextLine();
            throw e;

        }

        return new Magazine(title, publisher, language,day, month, year);
    }

}
