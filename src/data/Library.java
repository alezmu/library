package data;


public class Library {
    public final static int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber;
    private Publication [] publications;


    public static int getMaxPublications() {
        return MAX_PUBLICATIONS;
    }

    public int getPublicationsNumber() {
        return publicationsNumber;
    }

    public void setPublicationsNumber(int publicationsNumber) {
        this.publicationsNumber = publicationsNumber;
    }

    public Publication[] getPublications() {
        return publications;
    }

    public void setPublications(Publication[] publications) {
        this.publications = publications;
    }

    public Library() {
        publications = new Publication[MAX_PUBLICATIONS];

    }



    public void addBook(Book book) {

     addPublication(book);
    }
    public void addMagazine(Magazine magazine){
       addPublication(magazine);
    }


    private void addPublication(Publication pub)throws ArrayIndexOutOfBoundsException{
        if(publicationsNumber==MAX_PUBLICATIONS){
           throw new ArrayIndexOutOfBoundsException("Maksymalna liczba publikacji zostala osiagnieta "+MAX_PUBLICATIONS);
        }
        publications[publicationsNumber]=pub;
        publicationsNumber++;

    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<publicationsNumber;i++){
            builder.append(publications[i]);
            builder.append("\n");
        }
        return builder.toString() ;
    }



}