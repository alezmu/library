package data;

public class Book extends Publication{



	private String author;
	private int pages;
	private String isbn;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book (String title , String author, int year, int pages, String publisher, String isbn){

		setAuthor(author);
		setYear(year);
		setPages(pages);
		setPublisher(publisher);
		setIsbn(isbn);
		
	}
	
	
	public void printInfo(){
		System.out.println("title: "+ getTitle());
		System.out.println("author: "+ getAuthor());
		System.out.println("releaseDate: " + getYear());
		System.out.println("pages: " + getPages());
		System.out.println("publisher: " + getPublisher());
		System.out.println("isbn: " + getIsbn());
		System.out.println("-------------------");
		System.out.println();
	}
}