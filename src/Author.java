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
        return firstName;

    }

    public String getLastName() {
        return lastName;

    }

    public String getPatronymic() {
        return patronymic;

    }

    public String toString() {
        return "  Имя" + lastName + "  Фамилия   " + firstName + "  Отчество   " + patronymic;
    }

    public boolean equals(Author book1) {
        return lastName == book1.lastName && lastName == book1.firstName && patronymic == book1.patronymic;
    }
}



