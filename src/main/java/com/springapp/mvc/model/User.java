package com.springapp.mvc.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    @Column (name = "id")
//    private int id;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "name")
    private String name;

    @Column (name = "password")
    private String password;

    @Column (name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column (name = "age")
    private int age;

    public User(){
        //for hibernate
    }

    public User(String name, String password, Gender gender, int age) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Enumerated(EnumType.STRING)
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (!name.equals(user.name)) return false;
        if (!password.equals(user.password)) return false;
        return gender == user.gender;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
