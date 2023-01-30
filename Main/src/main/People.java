package main;
import java.time.LocalDate;
import java.util.Scanner;
import main.Food;
import main.Sport;

public class People {
    private int personID;
    private String name;
    private String gender;
    private int weight;
    private int height;
    private int dateOfBirtday;//dogum tarihi
    private Food eatenFood;
    private Sport doneSports;
    
    

    public People(int personID, String name, String gender, int weight, int height, int dateOfBirtday,Food eatenFood, Sport doneSports) {
        this.personID = personID;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.dateOfBirtday = dateOfBirtday;
        this.doneSports=doneSports;
        this.eatenFood=eatenFood;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDateOfBirtday() {
        return dateOfBirtday;
    }

    public void setDateOfBirtday(int dateOfBirtday) {
        this.dateOfBirtday = dateOfBirtday;
    }
    
    
}
