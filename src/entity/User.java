/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class User implements Serializable{
    private String login;
    private String password;
    private String role;
    private Reader reader;
    
    public User() {
        public class createUser {
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
    }

    public User(String login, String password, String role, Reader reader) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "User{"
                + "login=" + login 
                + ", password=" + password 
                + ", role=" + role 
                + ", reader=" + reader.
                + '}';
    }
    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
    
    
}
