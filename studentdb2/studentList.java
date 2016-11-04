/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;


import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mary Jean Cugal
 */
import java.util.*;
public class studentList{
    private List<Student> students;
    private File file;

    public studentList(List<Student> students , File file){
        this.students = students;
        this.file = file;
    }

    public studentList(){
        students = new ArrayList<>();
        createFile("students.txt");
    }


    public void createFile(String filename) {
        file = new File(filename);
        try{
            if(file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File exists!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    public boolean alreadyExists(String sn){
        BufferedReader br = null;
        if(students.isEmpty()){return false;}  //updated
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(file));
            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.equals("\tStudent Number: " + sn)){
                    return true;
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public void writeToFile(Student s){
         BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(file,true));
            bw.write(s.toString());
            bw.newLine();
            bw.close();
            System.out.println("DONE");
        }catch(IOException e){
        }finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException ex) {
            }
        }
    }

    public void append(){
        createFile("students.txt");
        //clearScreen(file);
        Student s = new Student();

        System.out.println("Please enter Student Information:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Student Number:");
        String sn = scan.next();
        if(alreadyExists(sn)){
            System.out.println("Student is already on the list!");
        }
        else{     //update : moved clearScreen()
            int ctr = 1 ;
            while(ctr<=8){
                switch(ctr){
                    case 1:
                        s.setStudentNumber(sn);
                        break;
                    case 2:
                        System.out.print("First name: ");
                        s.setFirstName(scan.next());
                        break;
                    case 3:
                        System.out.print("Middle initial: ");
                        String t = scan.next();
                        s.setMiddleInitial(t.charAt(0));
                        break;
                    case 4:
                        System.out.print("Last name: ");
                        s.setLastName(scan.next());
                        break;
                    case 5:
                        System.out.print("Course: ");
                        s.setCourse(scan.next());
                        break;
                    case 6:
                        System.out.print("Year level: ");
                        s.setYearLevel(scan.nextInt());
                        break;
                    case 7:
                        System.out.print("Crush Name: ");
                        s.setCrushName(scan.next());
                        break;
                    case 8:
                        System.out.print("Course: ");
                        String a = scan.next();
                        System.out.print("Course Description: ");
                        String b = scan.next();
                        Course fav = new Course(a,b);
                        s.setFaveSubject(fav);
                        break;
                }
                ctr++;
            }
            students.add(s);
            System.out.print("done!!!");
        }
    }

    public void search(){
        System.out.println("Search Student: ");
        Scanner scan = new Scanner(System.in);
        String sn = scan.next();
        if(alreadyExists(sn)){
            System.out.println(students.size());
            for (Student s: students) {
                if (s.getStudentNumber().equals(sn) == true) {
                    System.out.println(s);
                }
            }
        }else{
            System.out.println("Student is not on the list.:(");
        }
    }

    public void delete(){
        System.out.println("Delete Student: ");
        Scanner scan = new Scanner(System.in);
        String sn = scan.next();
        if(alreadyExists(sn)){
            for(Student s: students){
                if(s.getStudentNumber().equals(sn)){
                    students.remove(s); //remove here functions in remove in a list like a.remove, a.add
                    System.out.println("Student has been deleted");
                    break;
                }
            }
        }else{
            System.out.println("No match found for requested student.");
        }
    }

    public void save(){
       FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            System.out.println("save");
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}