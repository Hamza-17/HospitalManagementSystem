package com.company;

import java.util.Date;

public class Nurse extends MedicalStaff {
    public Nurse(String name, String gender, Date birthDate, Date jdate, String education, int[] record, int count) {
        super(name, gender, birthDate, jdate, education, count);
    }
}
