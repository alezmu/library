package app;
import data.Book;

class Library{
	public static void main (String[] args){
		
		final String appName ="Biblioteka v0.3";
		
		//
		Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg", "9788373271890" );
		Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", " Joshua Bloch", 2009, 352, "Helion", "9788324620845" );
		Book book3 = new Book("Muza", "Jessie Burton", 2016, 480, "Wydawnictwo Literackie", "9788308062357" );
		Book book4 = new Book("Swing Time", "Zadie Smith", 2017, 480, "Znak", "9788324050130" );
		
		System.out.println(appName);
		System.out.println("Ksiazki dostepne w bibliotece: ");
		book1.printInfo();
		book2.printInfo();
		book3.printInfo();
		book4.printInfo();
        	
	
	}	
}