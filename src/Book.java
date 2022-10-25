public class Book {
    private String name;
    private int age;
    private int result;

    public Book(String name, int age) {
    this.name = name;
    this.age = age;

    }

    public String getName() {
        return this.name();
    }

    private String name() {

    return this.name;
    }

    public int getAge() {
        return this.age();
    }

    private int age() {
        return this.age;
    }
    public String toString() {
        return "  Названия  " + this.name + "   дата выпуска  " + this.age;}

    public void setAge(int age) {
        this.age = age;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book bookSet1 = (Book) o;
        if (name != bookSet1.name) return false;
        if (age != bookSet1.age) return false;
        return age == bookSet1.age;
            }
    public int hashCode() {
        String result = String.valueOf(name == null ? 0 : name.hashCode());
        result = result + name;
        result = result + age;
        return this.result;
}}
