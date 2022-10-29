public class Main {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("Book 1");
        Author author = new Author(" Антон", " Чехов", " Павлович");
        System.out.println(author);
        Book bookSet = new Book("  Юмористические рассказы ", author, 2022);
        System.out.println("book.neme  " + bookSet.getName());
        System.out.println("book.releaseDate = " + bookSet.getAge());
        Author book = new Author(" Антон", " Чехов", " Павлович");
        System.out.println("author.neme  " + book.getFirstName());
        System.out.println("author.neme  " + book.getLastName());
        System.out.println("author.neme  " + book.getPatronymic());
        bookSet.setAge(2024);
        System.out.println("book.getAge() = " + bookSet.getAge());
        System.out.println("======================================");
        System.out.println("Book 2");
        Author author1 = new Author(" Алексей", " Михайлович", " Белов ");
        System.out.println(author1);
        Book bookSet1 = new Book("  Ars grammatica ", author1, 2017);
        System.out.println("book.neme  " + bookSet1.getName());
        System.out.println("book.releaseDate = " + bookSet1.getAge());
        Author book1 = new Author(" Алексей", " Михайлович", " Белов ");
        System.out.println("author.neme  " + book1.getFirstName());
        System.out.println("author.neme  " + book1.getLastName());
        System.out.println("author.neme  " + book1.getPatronymic());
        bookSet1.setAge(2024);
        System.out.println("book.getAge() = " + bookSet1.getAge());
        System.out.println("======================================");
        System.out.println(book);
        System.out.println(bookSet);
        System.out.println(book1);
        System.out.println(bookSet1);
        System.out.println("======================================");
        System.out.println("Эти два объекта равны друг другу?");
        System.out.println(bookSet.equals(bookSet1));
        System.out.println("======================================");
        System.out.println("Эти два объекта равны друг другу?");
        System.out.println(book1.equals(book));
        System.out.println("======================================");
        System.out.println("Какие у них хэш-коды?");
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println("======================================");
    }
}
