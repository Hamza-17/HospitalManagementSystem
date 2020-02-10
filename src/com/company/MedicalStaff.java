package com.company;

import java.util.Date;

public class MedicalStaff extends Staff {

   static Patient[] Record;
   static int count=0;


    public MedicalStaff(String name, String gender, Date birthDate, Date jdate, String education, int count) {
        super(name, gender, birthDate, jdate, education);
        Record=new Patient[100];
        this.count = count;
    }

    void register(Patient p){
        Record[count]=p;
        count++;

    }

    public Patient[] getRecord() {
        return Record;
    }

    public void setRecord(Patient[] record) {
        Record = record;
    }
}
