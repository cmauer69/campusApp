package com.campus.registration;

import java.util.ArrayList;

/**
 * Created by Student on 5/16/2016.
 */
public class CourseOffering {

    public CourseOffering(){

    }

    private String Course ;

    private String Semester;

    private String StrDaysofTheWeek;

    private String StrStartTime;

    private int intDuration;

    private int intMaxEnrollment;

    private String strInstructor;

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getStrDaysofTheWeek() {
        return StrDaysofTheWeek;
    }

    public void setStrDaysofTheWeek(String strDaysofTheWeek) {
        StrDaysofTheWeek = strDaysofTheWeek;
    }

    public String getStrStartTime() {
        return StrStartTime;
    }

    public void setStrStartTime(String strStartTime) {
        StrStartTime = strStartTime;
    }

    public int getIntDuration() {
        return intDuration;
    }

    public void setIntDuration(int intDuration) {
        this.intDuration = intDuration;
    }

    public int getIntMaxEnrollment() {
        return intMaxEnrollment;
    }

    public void setIntMaxEnrollment(int intMaxEnrollment) {
        this.intMaxEnrollment = intMaxEnrollment;
    }

    public String getStrInstructor() {
        return strInstructor;
    }

    public void setStrInstructor(String strInstructor) {
        this.strInstructor = strInstructor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    private ArrayList<Student> students;

    private String RoomNumber;


}
