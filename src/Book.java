public class Book {

    private final String name;
    private int publicationYear;
    // Не поняла как записать сюда данные об авторе?



    public Book (String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;

    }


    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }


    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;


    }


}
