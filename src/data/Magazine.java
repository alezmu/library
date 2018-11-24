package data;

public class Magazine extends  Publication {
    private int month;
    private int day;
    private String language;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language, int day, int month, int year ){
        setTitle(title);
        setPublisher(publisher);
        setLanguage(language);
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void printInfo(){
        System.out.println("title: "+ getTitle());
        System.out.println("publisher: " + getPublisher());
        System.out.println("language: "+ getLanguage());
        System.out.println("Day: " + getDay());
        System.out.println("Month: " + getMonth());
        System.out.println("Year: " + getYear());
        System.out.println("-------------------");
        System.out.println();
    }
}
