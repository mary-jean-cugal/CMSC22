/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mary Jean Cugal
 */
public class TestStudentLisst extends studentList{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        List<Student> students = new ArrayList<>();
        File file = new File("student.txt");
        studentList sl = new studentList(students,file);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        System.out.println("Menu:\n\t1. Add\n\t2. Search\n\t3. Delete\n\t4. Save\n\t5. Exit");
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(n!=5){
            n = sc.nextInt();
            switch(n) {
                case 1:
                    sl.append();
                    break;
                case 2:
                    sl.search();
                    break;
                case 3:
                    sl.delete();
                    break;
                case 4:
                    sl.save();
                    break;
                default:
                    break;
            }
        }
        try{
             fis = new FileInputStream(file);
             ois = new ObjectInputStream(fis);
             List<Student> s = (List<Student>) ois.readObject();
             ois.close();
        }catch(IOException e){
            e.printStackTrace();
        } 
    }
}
