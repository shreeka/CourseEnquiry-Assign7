/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.classwork.DAO;

import com.leapfrog.classwork.entity.Enquiry;
import java.util.List;

/**
 *
 * @author bekesh
 */
public interface EnquiryDAO {
    boolean insert(Enquiry e);
      List<Enquiry> getAll();
    boolean  searchByemail(String email);
    
}
