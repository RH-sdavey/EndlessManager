package com.company;

public class Player {

    private String firstName;
    private String surname;
    private String position;
    private Integer age;
    private Club club;

    public Player(String firstName, String surname, String position, Integer age, Club club) {
        this.firstName = firstName;
        this.surname = surname;
        this.position = position;
        this.age = age;
        this.club = club;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() { return surname; }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Club getClub() {
        return club;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
