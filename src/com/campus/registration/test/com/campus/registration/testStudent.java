package com.campus.registration;

import junit.framework.Test.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by clifford.mauer on 5/16/2016.
 */
public class testStudent {

    @Test
    public void getFullStudenName_FML_NoMiddle(){

        Student student = new Student();
        student.setStrFirstName("Clifford");
        student.setStrLastName("Mauer");

        assertEquals("Clifford Mauer", student.getFullName(true) );

    }

    @Test
    public void getFullStudenName_LFM_NoMiddle(){

        Student student = new Student();
        student.setStrFirstName("Clifford");
        student.setStrLastName("Mauer");

        assertEquals("Mauer, Clifford", student.getFullName(false) );

    }


}
