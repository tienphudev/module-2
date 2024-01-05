package model;

import model.Book;

public class FictionBook extends Book {
    public String Category;

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "model.FictionBook{" +
                "Category='" + Category + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
