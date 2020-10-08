/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Book;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author pupil
 */
public class BookSaver {
    public void saveBooks(Book[] books) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("books");
            oos = new ObjectOutputStream(fos);
        }catch (FileNotFoundedException ex) {
            System.out.println("Не найден файл");
        }catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
    }
    
public Book[] loadBooks
