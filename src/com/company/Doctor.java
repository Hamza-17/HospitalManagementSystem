package com.company;

import java.util.Date;

public class Doctor extends MedicalStaff {

   private int DocId;
   private String Speciality;

    public Doctor(String name, String gender, Date birthDate, Date jdate, String education, int count, int docId, String speciality) {
        super(name, gender, birthDate, jdate, education, count);
        DocId = docId;
        Speciality = speciality;
    }

    void Visit(Patient p){
        boolean b=true;
        for(int i=0;i<count;i++){

            if(Record[i].equals(p)==false){

                System.out.print(p.Name);
                System.out.print(" with ");
                System.out.print("pid: ");
                System.out.print(p.getPid());
                System.out.println(" has already visited today ");
                b=false;
                break;
            }


        }


        if(b){

            System.out.print(p.Name);
            System.out.print(" with ");
            System.out.print("pid: ");
            System.out.print(p.getPid());
            System.out.println(" is allowed ");

            Record[count]=p;
            count++;
        }


    }
}
