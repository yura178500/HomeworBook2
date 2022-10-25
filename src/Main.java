public class Main {

    public static void main(String[] args) {
        System.out.println("Book 1");
        Book bookSet = new Book("  Юмористические рассказы ", 2022);
        System.out.println("author.neme  " + bookSet.getName());
        System.out.println("book.releaseDate = " + bookSet.getAge());
        Author book = new Author(" Чехов Антон Павлович");
        System.out.println("book.neme  " + book.getAuthor());
        bookSet.setAge(2024);
        System.out.println("book.getAge() = " + bookSet.getAge());
        System.out.println("======================================");
        System.out.println("Book 2");
        Book bookSet1 = new Book("  Ars grammatica ", 2017);
        System.out.println("author.neme  " + bookSet1.getName());
        System.out.println("book.releaseDate = " + bookSet1.getAge());
        Author book1 = new Author(" Алексей Михайлович Белов " );
        System.out.println("book.neme  " + book1.getAuthor());
        bookSet1.setAge(2022);
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
