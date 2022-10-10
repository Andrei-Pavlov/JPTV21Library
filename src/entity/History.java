/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private books Books;
    private Reader reader;
    private Date takeOnBook;
    private Date returnBook;

    public History() {
    }

    public books getBooks() {
        return Books;
    }

    public void setBooks(books Books) {
        this.Books = Books;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getTakeOnBook() {
        return takeOnBook;
    }

    public void setTakeOnBook(Date takeOnBook) {
        this.takeOnBook = takeOnBook;
    }

    public Date getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
    }

    @Override
    public String toString() {
        return "History{"
                + "Books=" + Books
                + ", reader=" + reader
                + ", takeOnBook=" + takeOnBook
                + ", returnBook=" + returnBook + '}';
    }
    
}
