package com.company;

public class Club {

    private String shortName;
    private String longName;
    private String country;
    private String manager;
    private Integer capacity;
    private Integer cash;

    public Club(String shortName, String longName, String country, String manager, Integer capacity, Integer cash) {
        this.shortName = shortName;
        this.longName = longName;
        this.country = country;
        this.manager = manager;
        this.capacity = capacity;
        this.cash = cash;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }
}
