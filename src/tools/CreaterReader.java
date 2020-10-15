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
        System.out.println("--- Регистрация нового пользователя ---");
        System.out.print("Введите имя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.println("Введите фамилию: ");
        reader.setLastname(scanner.nextLine());
        System.out.println("Введите телефон: ");
        reader.setFirstname(scanner.nextLine());
        return reader;
    }
    public void addReaderToArray(Reader reader, Reader[] readers) {
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] == null){
                readers[i] = reader;
                break;
            }
        }
    }
       
 }
