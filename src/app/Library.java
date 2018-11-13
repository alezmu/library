package app;
import data.Book;

class Library{
	public static void main (String[] args){
		
		final String appName ="Biblioteka v0.5";

		Book [] books = new Book[1000];
		//
		books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg", "9788373271890" );
		books[1] = new Book("Java. Efektywne programowanie. Wydanie II", " Joshua Bloch", 2009, 352, "Helion", "9788324620845" );
		books[2] = new Book("Muza", "Jessie Burton", 2016, 480, "Wydawnictwo Literackie", "9788308062357" );
		books[3]= new Book("Swing Time", "Zadie Smith", 2017, 480, "Znak", "9788324050130" );
		
		System.out.println(appName);
		System.out.println("Ksiazki dostepne w bibliotece: ");
		books[0].printInfo();
		books[1].printInfo();
		books[2].printInfo();
		books[3].printInfo();
        	
	
	}	
}