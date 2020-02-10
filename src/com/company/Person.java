package com.company;

import java.util.Date;

public class Person {
  protected   String Name;
   protected String Gender;
    protected Date BirthDate;


    public Person(String name, String gender, Date birthDate) {
        Name = name;
        Gender = gender;
        BirthDate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }
}
