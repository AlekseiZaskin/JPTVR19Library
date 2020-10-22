/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creators;

import java.util.Scanner;
import entity.Book;
/**
 *
 * @author pupil
 */
public class BookManager {
    private Scanner scanner = new Scanner(System.in);
    public Book createBook() {
        Book book = new Book();
        System.out.println("--- Создание книги ---");
        System.out.println("Введите имя книги: ");
        book.setName(scanner.nextLine());
        System.out.println("Введите автора книги: ");
        book.setAuthor(scanner.nextLine());
        System.out.println("Введите год издания книги: ");
        book.setPublishedYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Введите ISBN книги: ");
        book.setIsbn(scanner.nextLine());
        return book;
    }

    public void addBookToArray(Book book, Book[] books) {
        for (int i = 0; i < books.length; i++ ) {
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    public void printListBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                System.out.println(i+1+". " + books[i].toString());
            }
        }   
    }
    
}
