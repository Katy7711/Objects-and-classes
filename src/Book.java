public class Book {

    private final String name;
    private int publicationYear;
    private final Author author;


    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }


    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }


    public Author getAuthor() {
        return this.author;
    } // почему у меня тут выдает такую ошибку Method 'getAuthor()' is never used
    // получается не надо создавать getAuthor?


    public void setPublicationYear(int publicationYear) {
        if (publicationYear < 0) {
            throw new IllegalArgumentException("год не может быть отрицательным");
        }
        this.publicationYear = publicationYear;

    }


    @Override
    public String toString() {
        return "название книги - " + this.name + ", год публикации - " + this.publicationYear + ", " + this.author;

    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book Book = (Book) other;
        return name.equals(Book.name);
    } // подскажите пожалуйста как правильно применить метод equals, у меня не получается, я хотела
    //  сравнивать книги например, если у них одно название,год публикации и автор, то они равны, как сделать еще сравнение
    // по году публикации и автору
    // и вообще правильно я его применила?


    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, publicationYear, author);
    }
}
