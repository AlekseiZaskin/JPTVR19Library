/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19library;

import entity;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("--- Библиотека ---");
        boolean repeat = true;
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Список книг");
            System.out.println("3. Зарегистрировать читателя");
            System.out.println("4. Список читателей");
            System.out.println("5. Выдать книгу читателю");
            System.out.println("6. Вернуть книгу в библиотеку");
            System.out.print("Выберите задачу");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- Конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить новую книгу ---");
                break;
                case "2":
                    System.out.println("--- Список книг ---");
                break;
                case "3":
                    System.out.println("--- Зарегистрировать читателя ---");
                break;
                case "4":
                    System.out.println("--- Список читателей ---");
                break;
                case "5":
                    System.out.println("--- Выдать книгу читателю ---");
                break;
                case "6":
                    System.out.println("--- Вернуть книгу в библиотеку ---");

                break;
                default:
                    System.out.println("Нет такой задачи");
            }   
        }
    }while(repeat);
}