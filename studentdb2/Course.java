/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

import java.io.*;
/**
 *
 * @author Mary Jean Cugal
 */
public class Course implements Serializable{
    String course;
    String courseDescription;
    public Course(String a, String b){
        this.course = a;
        this.courseDescription = b;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void setCourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
    }
    public String getCourseDescription(){
        return courseDescription;
    }
}
