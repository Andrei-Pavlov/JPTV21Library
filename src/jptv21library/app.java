/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class app {
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
                case 2:
                    System.out.println("2. Добавить читателя");
                case 3:
                    System.out.println("3. Выдать книгу");
                case 4:
                    System.out.println("4. Вернуть книгу");
                case 5:
                    System.out.println("5. Буклист");
                default:
                    System.out.println("Выберите задачу из списа");
            }
        }while(repeat);
        
    }
}
