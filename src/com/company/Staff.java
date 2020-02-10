package com.company;

import java.util.Date;

public class Staff extends Person {
  private   Date Jdate;
   private String education;

    public Date getJdate() {
        return Jdate;
    }

    public void setJdate(Date jdate) {
        Jdate = jdate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Staff(String name, String gender, Date birthDate, Date jdate, String education) {
        super(name, gender, birthDate);
        Jdate = jdate;
        this.education = education;
    }
}
