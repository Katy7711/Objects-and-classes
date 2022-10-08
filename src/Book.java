import java.util.Objects;

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
    } // и тут тоже не поняла, метод нигде не используется, он лишний или его все таки надо где-то использовать?


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(publicationYear, book.publicationYear) && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }// то есть вот так надо? У меня тогда все равно выходит false. Не совсем поняла с этим методом, значит он может автоматически
    // генерироваться с ошибкой и его надо подправлять?

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear, author);
    }
}
