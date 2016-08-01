/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.classwork.Impl;

import com.leapfrog.classwork.DAO.CourseDAO;
import com.leapfrog.classwork.entity.Course;
import com.leapfrog.classwork.entity.Enquiry;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bekesh
 */
public class CourseDAOImpl implements CourseDAO {
    

    
    private int counter = 0;
    private List<Course> courseList=new ArrayList<>();

    @Override
    public boolean insert(Course c) {
       return courseList.add(c);
    }

    @Override
    public List<Course> getAll() {
       return courseList;
    }

    @Override
    public boolean searchById(int id) {
        for(Course c:courseList)
        {
            if(c.getCourse_id()==id)
            {
                return true;
            }
        }
        return false;
        }
        
  
    
}
