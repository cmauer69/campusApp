package com.campus.registration;

/**
 * Created by clifford.mauer on 5/16/2016.
 */
public class Course {

    public Course(){

    }

    private String strCourseId;

    private String strDepartmentCode;

    private int intCourseNo;

    private String strCourseName;

    public String getStrCourseId() {
        return strCourseId;
    }

    public void setStrCourseId(String strCourseId) {
        this.strCourseId = strCourseId;
    }

    public String getStrDepartmentCode() {
        return strDepartmentCode;
    }

    public void setStrDepartmentCode(String strDepartmentCode) {
        this.strDepartmentCode = strDepartmentCode;
    }

    public int getIntCourseNo() {
        return intCourseNo;
    }

    public void setIntCourseNo(int intCourseNo) {
        this.intCourseNo = intCourseNo;
    }

    public String getStrCourseName() {
        return strCourseName;
    }

    public void setStrCourseName(String strCourseName) {
        this.strCourseName = strCourseName;
    }
}
