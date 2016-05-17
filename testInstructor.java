package com.campus.registration;

import junit.framework.Test.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Student on 5/16/2016.
 */
public class testInstructor {

    @Test
    public void getFullInstructorName_FML_NoMiddle(){

        Instructor instructor = new Instructor();
        instructor.setStrFirstName("Mary");
        instructor.setStrLastName("Moosman");

        assertEquals("Mary Moosman", instructor.getFullName(true) );

    }


    @Test
    public void getFullInstructorName_LFM_NoMiddle(){

        Instructor instructor = new Instructor();
        instructor.setStrFirstName("Mary");
        instructor.setStrLastName("Moosman");

        assertEquals("Moosman, Mary", instructor.getFullName(false) );

    }

}
