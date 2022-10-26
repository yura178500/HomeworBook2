public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "  Названия  " + name + "   дата выпуска  " + age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book bookSet1 = (Book) o;
        return age == bookSet1.age && name.equals(bookSet1.name);
    }

    private int result;

    public int hashCode() {
        String result = String.valueOf(name == null ? 0 : name.hashCode());
        result = result + name;
        result = result + age;
        return this.result;
    }
}
