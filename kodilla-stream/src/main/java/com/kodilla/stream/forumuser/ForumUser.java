package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public final class ForumUser {

    private int userID;
    private String userName;
    private char gender;
    private LocalDate birthDate;
    private int quantityOfPost;

    public ForumUser(int userID, String userName, char gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int quantityOfPost) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityOfPost = quantityOfPost;
    }

    public int getPeriodYer() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(this.birthDate, today);

        return p.getYears();
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityOfPost() {
        return quantityOfPost;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUserID() == forumUser.getUserID() &&
                getGender() == forumUser.getGender() &&
                getQuantityOfPost() == forumUser.getQuantityOfPost() &&
                getUserName().equals(forumUser.getUserName()) &&
                getBirthDate().equals(forumUser.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getUserName(), getGender(), getBirthDate(), getQuantityOfPost());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", quantityOfPost=" + quantityOfPost +
                '}';
    }
}
