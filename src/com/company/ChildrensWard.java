package com.company;

public class ChildrensWard extends Wards {

    void managed(Staff s){
        System.out.println(s.Name);
        System.out.println("of staff managing  children Wards");
    }
}
