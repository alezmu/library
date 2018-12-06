package app;

public enum Option {

    EXIT(0," Wyjscie z programu "),
    ADD_BOOK(1," Dodaj ksiazke"),
    ADD_MAGAZINE(2,"Dodanie magazynu, gazety"),
    SHOW_BOOKS(3, "Pokaz ksiaki w bibliotece"),
    SHOW_MAGAZINES(4,"Pokaz magazyny w bibliotece");


    private int value;
    private  String description;

    public int getValue(){
        return value;
    }

    public String getDescription(){
        return description;
    }
    Option(int value, String desc){
        this.value =value;
        this.description = desc;
    }

    @Override
    public String toString(){
        return value+" - "+description;
    }

    public static Option createFromInt(int option){
        return Option.values()[option];
    }

}


