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
public class Reader {
    private String firstname;
    private String Lastname;
    private String phone;

    public Reader() {
    }

    public Reader(String name, String Lastname, String phone) {
        this.firstname = name;
        this.Lastname = Lastname;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{" + "name=" + firstname + ", Lastname=" + Lastname + ", phone=" + phone + '}';
    }
    
    
}
