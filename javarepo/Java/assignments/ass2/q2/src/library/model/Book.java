package library.model;

import library.service.printable;

public class Book extends LibraryResource implements printable {

     public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }

    @Override
    public void printDetails() {
        System.out.println("Book ID: " + getResourceId());
        System.out.println("Title: " + getTitle());
        System.out.println("written by: " + getAuthor());
       
    }
    
}
