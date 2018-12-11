package data;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.util.Objects;

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
       super(year, title, publisher);
        setLanguage(language);
        setDay(day);
        setMonth(month);

    }


    @Override
    public  String toString(){
        StringBuilder print = new StringBuilder(32);
        print.append(getTitle());
        print.append("; ");
        print.append(getPublisher());
        print.append("; ");
        print.append(getLanguage());
        print.append("; ");
        print.append(getDay());
        print.append(":");
        print.append(getMonth());
        print.append(":");
        print.append(getYear());
        return print.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return getMonth() == magazine.getMonth() &&
                getDay() == magazine.getDay() &&
                Objects.equals(getLanguage(), magazine.getLanguage());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getMonth(), getDay(), getLanguage());
    }
}
