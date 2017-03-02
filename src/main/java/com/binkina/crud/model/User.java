package com.binkina.crud.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "isAdmin")
    private Boolean isAdmin;

    @Column(name = "createdDate")
    private Timestamp createdDate ;

    public User(){
        createdDate = new Timestamp(System.currentTimeMillis());
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isAdmin=" + isAdmin +
                ", createdDate=" + createdDate +
                '}';
    }
}
