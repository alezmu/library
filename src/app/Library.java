package app;
import data.Book;
import utils.DataReader;

class Library{
	public static void main (String[] args){
		
		final String appName ="Biblioteka v0.5";

		Book [] books = new Book[1000];

		DataReader dataReader = new DataReader();
		System.out.println(appName);
		System.out.println("Wprowadz nowa ksiazke: ");

		//
		books[0] = dataReader.readAndCreateBook();
		books[1] = dataReader.readAndCreateBook();
		//books[2] = new Book("Muza", "Jessie Burton", 2016, 480, "Wydawnictwo Literackie", "9788308062357" );
		//books[3]= new Book("Swing Time", "Zadie Smith", 2017, 480, "Znak", "9788324050130" );
		dataReader.close();

		System.out.println("Ksiazki dostepne w bibliotece: ");
		books[0].printInfo();
		books[1].printInfo();
		System.out.println("Biblioteka moze przechowywac do "+books.length+" ksiazek");

        	
	
	}	
}