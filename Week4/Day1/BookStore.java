package Week4.Day1;

import java.util.ArrayList;

public class BookStore {
    private  String title;
    private  String author;
    private  int yearPublished;

    public BookStore(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public static void main(String[] args) {
        ArrayList<BookStore> bookStore = new ArrayList<>();

        bookStore.add(new BookStore("JAva", "Sundeep", 1995));
        bookStore.add(new BookStore("JavaScript", "Prakas", 2002));
        bookStore.add(new BookStore("C++", "Sabita", 1990));
        bookStore.add(new BookStore("Python", "Deepak", 2015));
        bookStore.add(new BookStore("Vue JS", "Zola", 2020));
        bookStore.add(new BookStore("Angular", "Jay", 1999));

        for (BookStore bukStore:bookStore) {
            if (bukStore.getYearPublished()>2000){
                System.out.println("Book title: " + bukStore.getTitle() + ", Publidhed Year: " + bukStore.getYearPublished());
            }
        }
    }
}


