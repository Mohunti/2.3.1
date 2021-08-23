package web.model;

import java.util.List;

public class User {

    private String name;
    private String surname;
    private String age;
    private String carByUser;

    public User(String name, String surname, String age, String carByUser) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.carByUser = carByUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCarByUser() {
        return carByUser;
    }

    public void setCarByUser(String car) {
        this.carByUser = carByUser;
    }

    public User() {
    }
}
