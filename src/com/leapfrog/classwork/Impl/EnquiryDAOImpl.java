/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.classwork.Impl;

import com.leapfrog.classwork.DAO.EnquiryDAO;
import com.leapfrog.classwork.entity.Enquiry;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bekesh
 */
public class EnquiryDAOImpl implements EnquiryDAO{
     private int counter = 0;
   private List<Enquiry> enquiryList=new ArrayList<>();

    @Override
    public boolean insert(Enquiry e) {
        return enquiryList.add(e);
    }

    @Override
    public  List<Enquiry> getAll() {
       return enquiryList;
    }

    @Override
    public boolean searchByemail(String email) {
       for(Enquiry e:enquiryList)
        {
            if(e.getEmail().contentEquals(email))
            {
                return true;
            }
        }
        return false;
    }

    
    

}