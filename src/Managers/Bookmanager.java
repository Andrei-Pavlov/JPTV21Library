/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import entity.Author;
import entity.books;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Bookmanager {
    private Scanner scanner;
    
    public Bookmanager() {
        this.scanner = new Scanner(System.in);
    }
    public books createBook(){
        books book = new books();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги - ");
        book.setTitle(scanner.nextLine());
        System.out.println("Введите чисто авторов книги - ");
        int countAuthorsInBook = scanner.nextInt();
        scanner.nextLine();
        if (countAuthorsInBook <=0){
            System.out.println("net");
        } else
            book.setAuthor(createAuthors(countAuthorsInBook));
            return book;
    }
    private Author[] createAuthors(int countAuthorsInBook) {
        Author[] authors = new Author[countAuthorsInBook];
        for (int i = 0; i < countAuthorsInBook; i++) {
            Author author = new Author();
            System.out.print("Имя автора - " +(i+1)+": ");
            author.setFirstname(scanner.nextLine());
            System.out.println("Фамилия автора - "+(i+1)+": ");
            author.setLastname(scanner.nextLine());
            authors[i] = author;
        }
        return authors;
    }
}
