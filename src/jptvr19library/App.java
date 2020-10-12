/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19library;


import tools.CreatorHistory;
import tools.creatorHistory;
import tools.history;
import tools.BookSaver;
import entity.Book;
import entity.Reader;
import java.util.Scanner;
import tools.CreaterBook;
import tools.CreaterReader;

/**
 *
 * @author pupil
 */
class App {
    private Book[] books = new Book[10];
    private Reader[] readers = new Reader[10];
    private History[] histories = new History[10];
    
    public App() {
        BookSaver bookSaver = new BookSaver();
        books = bookSaver.loadBooks();
    }
    
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
            System.out.print("Выберите задачу:");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- Конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить новую книгу ---");
                    //Book book = new Book("Voina i mir", "L.Tolstoy", 2010, "123-1234");
                    CreaterBook createrBook = new CreaterBook();
                    Book book = createrBook.getBook(); 
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] == null){
                            books[i] = book;
                            break;
                        }
                    }
                    BookSaver bookSaver = new BookSaver();
                    System.out.println("Название книги" +book.getName());
                    break;
                case "2":
                    System.out.println("--- Список книг ---");
                    for (int i = 0; i < books.length; i++) {
                        if (books[i] != null){
                             System.out.println(i+1+". " + books[i].toString());
                        }
                    }
                    break;
                case "3":
                    System.out.println("--- Зарегистрировать читателя ---");

                    CreaterReader createrReader = new CreaterReader();
                    Reader reader = createrReader.getReader(); 
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] == null){
                            readers[i] = reader;
                            break;
                        }
                    }
                    System.out.println("Название книги" +reader.getFirstname());
                    break;
                case "4":
                    System.out.println("--- Список книг ---");
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null){
                             System.out.println(i+1+". " + readers[i].toString());
                        }
                    }
                    break;
                    System.out.println("Фамилия читателя: "+reader.getLastname());
                    break;
                case "4":
                    System.out.println("--- Список читателей ---");
                    break;
                case "5":
                    System.out.println("--- Выдать книгу читателю ---");
                    CreatorHistory Creatorhistory = new CreatorHistory();
                    history history = creatorHistory.takeOnBook(books, readers);
                    if (historyes[i] == null) {
                        historyes[i] = history;
                        break;
                      }   
                    }
                    
                case "6":
                    System.out.println("--- Вернуть книгу в библиотеку ---");

                break;
                default:
                    System.out.println("Нет такой задачи");
            }
        }while(repeat);
    }
}
