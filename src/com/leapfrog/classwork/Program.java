/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.classwork;

import com.leapfrog.classwork.DAO.CourseDAO;
import com.leapfrog.classwork.DAO.EnquiryDAO;
import com.leapfrog.classwork.Impl.CourseDAOImpl;
import com.leapfrog.classwork.Impl.EnquiryDAOImpl;
import com.leapfrog.classwork.controller.ProgramController;
import com.leapfrog.classwork.entity.Course;
import com.leapfrog.classwork.entity.Enquiry;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bekesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws FileNotFoundException, IOException {
        
        CourseDAO courseDAO = new CourseDAOImpl();
        EnquiryDAO enquiryDAO = new EnquiryDAOImpl();
        ProgramController pc=new ProgramController(courseDAO, enquiryDAO);
        pc.process();
        
        
    }
   
   
   
   
   
    
}
