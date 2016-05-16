package com.campus.registration;

import java.util.ArrayList;

/**
 * Created by clifford.mauer on 5/16/2016.
 */
public class Instructor extends Person{

    public Instructor(){

    }

    private int intEmployeeId;

    public int getIntEmployeeId() {
        return intEmployeeId;
    }

    public void setIntEmployeeId(int intEmployeeId) {
        this.intEmployeeId = intEmployeeId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    private ArrayList<Course> courses;


}
