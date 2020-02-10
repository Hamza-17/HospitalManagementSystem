package com.company;

import com.company.Person;

import java.util.Date;

public class FaisalHospital {

    String name;
    String address;
    private Person[] list;
    static int total=0;
    Wards wards[];
    static int wcount=0;

    public FaisalHospital(String name, String address) {
        this.name = name;
        this.address = address;
        //total=0;
        list=new Person[100];
        wards=new Wards[3];
        //wcount=0;
    }



    void SetWard(Wards w){
        wards[wcount]=w;
        wcount++;


    }

    void VisitHospital(String n,String g, Date d){
Person p=new Person(n,g,d);
list[total]=p;
total++;
        System.out.print(n);
System.out.println(" entered saved in records");


    }


}
