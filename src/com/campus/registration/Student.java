package com.campus.registration;

import java.util.ArrayList;

/**
 * Created by clifford.mauer on 5/16/2016.
 */
public class Student extends Person {

    public Student(){

    }

    private int intStudentId;

    private int yearEnrolled;

    public int getIntStudentId() {
        return intStudentId;
    }

    public void setIntStudentId(int intStudentId) {
        this.intStudentId = intStudentId;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(int yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public ArrayList<Course> getRegcourses() {
        return regcourses;
    }

    public void setRegcourses(ArrayList<Course> regcourses) {
        this.regcourses = regcourses;
    }

    private ArrayList<Course> regcourses ;



}
