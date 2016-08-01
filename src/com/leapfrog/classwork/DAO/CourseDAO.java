/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.classwork.DAO;

import com.leapfrog.classwork.entity.Course;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author bekesh
 */
public interface CourseDAO {
     
     boolean insert(Course c);
     List <Course> getAll();
      boolean  searchById(int id);
}
