package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Date d1=null;

FaisalHospital fh=new FaisalHospital("FH","B Block Model town");
        Doctor d=new Doctor("hamza","m",d1,d1,"primary",0,98,"neurosurgeon");
        Doctor d11=new Doctor("hassan","m",d1,d1,"primary",0,98,"neurosurgeon");
        Patient p=new Patient("aslam","m",d1,12,"27-02-17");
        Patient u=new Patient("nabeel","m",d1,13,"17-02-17");
        Patient q=new Patient("ayesha","f",d1,14,"17-02-20");
        fh.VisitHospital(d.getName(),d.getGender(),d1);
        fh.VisitHospital(p.getName(),p.getGender(),d1);
        fh.VisitHospital(u.getName(),u.getGender(),d1);
        fh.VisitHospital(q.getName(),q.getGender(),d1);
        fh.VisitHospital(d11.getName(),d11.getGender(),d1);
        d.Visit(p);
        d.Visit(p);
       // d11.Visit(p);
        d.Visit(u);
        d.Visit(u);
        d.Visit(q);







    }
}
