public class Book {
    private String name;
    private String author;
    private int age;


    public Book(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;

    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "  Названия  " + name + "  ФИО  " + author + "   дата выпуска  " + age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book bookSet1 = (Book) other;
        return age == bookSet1.age && name.equals(bookSet1.name) && author.equals(bookSet1.author);
    }

    private int result;

    public int hashCode() {
        String result = String.valueOf(name == null ? 0 : name.hashCode());
        result = result + name;
        result = result + age;
        result = result + author;
        return this.result;
    }
}
