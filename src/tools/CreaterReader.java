/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Book;
import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CreaterReader {
    private Scanner scanner = new Scanner(System.in);
    public Reader getReader() {
        Reader reader = new Reader();
        System.out.println("--- Создание книги ---");
        System.out.println("Введите имя книги: ");
        reader.setFirstname(scanner.nextLine());
        System.out.println("Введите автора книги: ");
        reader.setLastname(scanner.nextLine());
        System.out.println("Введите год издания книги: ");
        reader.setPhone(scanner.nextLine());
        scanner.nextLine();
        return reader;
    }
    
 }
