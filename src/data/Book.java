package data;

public class Book{


	private String title;
	private String author;
	private int releaseDate;
	private int pages;
	private String publisher;
	private String isbn;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	public Book (String title , String author, int releaseDate, int pages, String publisher, String isbn){
		setTitle(title);
		setAuthor(author);
		setReleaseDate(releaseDate);
		setPages(pages);
		setPublisher(publisher);
		setIsbn(isbn);
		
	}
	
	
	public void printInfo(){
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