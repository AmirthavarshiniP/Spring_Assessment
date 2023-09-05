package com.example.springasses;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="User")
public class User {
    private int userId;
    private String userName;
    private String userEmail;
    private String gender;
    private int age;
    private String nationality;


    public int getUserId() {
        return userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public User() {
    }

    public User(int userId, String userName, int age, String userEmail, String gender, String nationality) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.gender = gender;
        this.nationality = nationality;
        this.age = age;

    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
