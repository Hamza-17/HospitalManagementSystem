package com.company;

import java.util.Date;

public class Patient extends Person{

   private int Pid;
   private String date;

    public Patient(String name, String gender, Date birthDate, int pid, String d) {
        super(name, gender, birthDate);
        Pid = pid;
        date=d;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }


    public boolean equals(Patient P) {
        if(Pid==P.Pid && date.equalsIgnoreCase(P.date)==true){

            return false;
        }

        else {

            return true;
        }
    }
}
