package com.campus.registration;

/**
 * Created by Student on 5/16/2016.
 */
public class Person {

    public Person(){

    }

    private String strFirstName;
    private String strMiddleName;
    private String strLastName;

    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrMiddleName() {
        return strMiddleName;
    }

    public void setStrMiddleName(String strMiddleName) {
        this.strMiddleName = strMiddleName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getFullName(Boolean blnNameOrder){
        String fullname = "";

        if (strMiddleName == null || strMiddleName.trim().isEmpty()){
            if (blnNameOrder){
                fullname = strFirstName + " " + strLastName ;
            }
            else {
                fullname = strLastName + " " + strFirstName ;
            }

        }
        else {
            if (blnNameOrder){
                fullname = strFirstName + " " + strMiddleName + " " + strLastName;
            }
            else {
                fullname = strLastName + ", " + strFirstName + " " + strMiddleName;
            }
        }

        return fullname;
    }
}
