class Book{
	
	String title;
	String author;
	int releaseDate;
	int pages;
	String publisher;
	String isbn;
	
	Book (String bookTitle, String bookAuthor, int bookReleaseDate, int bookPages, String bookPublisher, String bookIsbn){
		title = bookTitle;
		author = bookAuthor;
		releaseDate = bookReleaseDate;
		pages = bookPages;
		publisher = bookPublisher;
		isbn = bookIsbn;
		
	}
	
	
	void printInfo(){
		System.out.println("title: "+ title);
		System.out.println("author: "+ author);
		System.out.println("releaseDate: " + releaseDate);
		System.out.println("pages: " + pages);
		System.out.println("publisher: " + publisher);
		System.out.println("isbn: " + isbn);
		System.out.println("-------------------");
		System.out.println();
	}
}