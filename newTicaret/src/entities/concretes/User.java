package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {

    private int id;
    private String firsName;
    private String lastName;
    private String mail;
    private String pass;

    public User() {

    }

    public User(int id, String firsName, String lastName, String mail, String pass) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.mail = mail;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
