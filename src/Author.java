public class Author {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Author(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;

    }

    public String getFirstName() {
        return this.firstName;

    }

    public String getLastName() {
        return this.lastName;

    }

    public String getPatronymic() {
        return this.patronymic;

    }

    public String toString() {
        return "  Имя" + this.lastName + "  Фамилия   " + this.firstName + "  Отчество   " + this.patronymic;
    }

    public boolean equals(Author book1) {
        return lastName == book1.lastName && firstName == book1.firstName && patronymic == book1.patronymic;
    }
}



