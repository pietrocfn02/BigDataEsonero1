package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Employee {

    private String name;
    private String surname;
    private Integer age;
    private City livingIn;
    private ProgrammingLanguage[] languages;


    public Employee(String name, String surname, Integer age, City city, ProgrammingLanguage[] languages) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.livingIn = city;
        this.languages = languages;

    }


    public String getJson() {
        Gson g = new Gson();

        return g.toJson(this);

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public City getLivingIn() {
        return livingIn;
    }

    public void setLivingIn(City livingIn) {
        this.livingIn = livingIn;
    }

    public ProgrammingLanguage[] getLanguages() {
        return languages;
    }

    public void setLanguages(ProgrammingLanguage[] languages) {
        this.languages = languages;
    }
}
