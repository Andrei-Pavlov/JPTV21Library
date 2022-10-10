/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21library;

import Managers.Bookmanager;
import entity.Author;
import entity.books;
import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class app {
    private books[] book;
    
    public app() {
        this.book = new books[0];
    }
    public void run (){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Выберите номер задачи - ");
            System.out.println("Список задач:");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Буклист");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("______________________________");
            switch(task) {
                case 0:
                    repeat = false;
                    System.out.println("BYE");
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    Bookmanager bookManager = new Bookmanager();
                    this.book = Arrays.copyOf(this.book, this.book.length+1);
                    this.book[this.book.length-1] = bookManager.createBook();
                case 2:
                    System.out.println("2. Добавить читателя");
                case 3:
                    System.out.println("3. Выдать книгу");
                case 4:
                    System.out.println("4. Вернуть книгу");
                case 5:
                    System.out.println("5. Буклист");
//                    for (int i = 0; i < book.length; i++) {
//                        books books = book[i];
//                        System.out.printf("Book{title = %s%n\t",books.getTitle());
//                        System.out.println("\tAuthors = [\n't't");
//                        for (int j = 0; j < books.getAuthor().length; j++) {
//                            Author author = books.getAuthor()[j];
//                            System.out.printf("%s %s%n", author.getFirstname(), author.getLastname());
//                        }
//                        System.out.println("\t]");
//                    }
//                    System.out.println("  }");
                    System.out.println(Arrays.toString(book));
                default:
                    System.out.println("Выберите задачу из списа");
            }
        }while(repeat);
        
    }
}
