public class Main {

    public static void main(String[] args) {


        Author author1 = new Author("Lev", "Tolstoy");
        Author author2 = new Author("Alexander", "Pushkin");
        System.out.println("author1.name = " + author1.getName() + ", author1.lastName = " + author1.getLastName());
        System.out.println("author2.name = " + author2.getName() + ", author2.lastName = " + author2.getLastName());

        Book book1 = new Book("Война и мир", 1864, author1);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.publicationYear = " + book1.getPublicationYear());
        book1.setPublicationYear(1865);
        System.out.println("book1.getPublicationYear() = " + book1.getPublicationYear());

        Book book2 = new Book("Капитанская дочка", 1835, author2);
        System.out.println("book2.name = " + book2.getName());
        System.out.println("book2.publicationYear = " + book2.getPublicationYear());
        book2.setPublicationYear(1836);
        System.out.println("book2.getPublicationYear() = " + book2.getPublicationYear());


        Book book3 = new Book("Война и мир", 1864, author1);
        System.out.println(book1.equals(book3));


        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());




        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1);
        System.out.println(author2);


    }



}