/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.classwork.entity;

/**
 *
 * @author bekesh
 */
public class Course {
    private int course_id;
    private String course_name;
    private double fee;

    public Course() {
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public double getFee() {
        return fee;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
}
