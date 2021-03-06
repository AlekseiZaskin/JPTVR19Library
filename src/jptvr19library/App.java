/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19library;


import tools.creators.LibraryManager;
import tools.creatorHistory;
import tools.history;
import tools.BookSaver;
import entity.Book;
import entity.Reader;
import java.util.Scanner;
import tools.creators.BookManager;
import tools.CreaterReader;

/**
 *
 * @author pupil
 */
class App {
    private Book[] books = new Book[10];
    private Reader[] readers = new Reader[10];
    private History[] histories = new History[10];
    private BookManager bookManager = new BookManaer();
    private ReaderManager readerManager = new ReaderManager();
    private LibraryManager libraryManager = new LibraryManager();
    private BookSaver bookSaver = new BookSaver();
    private ReaderSaver readerSaver = new ReaderSaver();
    private HistorySaver historySaver = new HistorySaver();
    private SecureManager secureManager = new SecureManager();
    
    private User loginedUser;
    public App() {
        BookSaver bookSaver = new BookSaver();
        books = bookSaver.loadBooks();
        ReaderSaver readerSaver = new ReaderSaver = new ReaderSaver();
        reeaders = readerSaver.loadReaders();
        HistorySaver historySaver = new ReaderSaver();
        histories = historySaver.loadHistories();
       
    }
    
    public void run(){
        System.out.println("--- Библиотека ---");
        this.loginedUser = secureManager.checkTask(users,readers)
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
            System.out.println("7. Список выданных книг");
            System.out.println("Список выданных книг");
            System.out.println("Выберите задачу: ");
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
                    BookManager BookManager = new BookManager();
                    Book book = BookManager.createBook(); 
                    BookManager.addBookToArray(book,books);
                    BookSaver bookSaver = new BookSaver();
                    bookSaver.saveBooks(books);
                    
                    System.out.println("Создана книга:" +book.getName());
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
                    ReaderManager readerManager = new ReaderManager();
                    Reader reader = readerManager.createReader();
                    
                    System.out.println("<Имя читателя: " 
                            +reader.getFirstName()
                            +" "
                            + reader.getLastname()
                    );
                    readerManager.addReaderToArray(reader,readers)
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
                    LibraryManager Creatorhistory = new LibraryManager();
                    history history = creatorHistory.takeOnBook(books, readers);
                    if (historyes[i] == null) {
                        historyes[i] = history;
                        break;
                      }   
                    }
                    
                case "6":
                    System.out.println("--- Вернуть книгу в библиотеку ---");

                break;
                
                case "7":
                    System.out.println("--- Список выданных книг ---");
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] !=null){
                            System.out.printf("%d. Книгу \"%s\" читает %s %s")
                                    ,i+1
                                    ,histories[i].getBook().getName()
                                    ,histories[i].getReader().getFirstname()
                                    ,histories[i].getReader().getLastname()
                            );                                       
                        }
                    }
                    break;
                default:
                    System.out.println("Нет такой задачи");
            }
        }while(repeat);
    }
}
