package model;

import model.Book;

public class ProgrammingBook extends Book {
    public String language;
    public String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "model.ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
