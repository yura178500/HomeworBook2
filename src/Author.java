public class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;

    }

    public String toString() {
        return "  ФИО   " + this.author;
    }
    public boolean equals(Author book1) {
        return this.author == book1.author;
    }
}



