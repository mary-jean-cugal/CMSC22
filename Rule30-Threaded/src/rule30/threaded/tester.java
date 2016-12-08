package rule30.threaded;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mary Jean Cugal
 */
public class tester {
     public static void main (String args[]){
        int gridSize;
        System.out.println("Enter grid size : ");
        Scanner s = new Scanner(System.in);
        gridSize = s.nextInt();
        long startTime1, startTime2, threadedTime, nonThreadedTime;
         
        // non Threaded
//        startTime1 = System.currentTimeMillis();
//        nonThreaded r = new nonThreaded(gridSize);
//        r.createGen();
//        nonThreadedTime = System.currentTimeMillis() - startTime1;
//        System.out.println(r.showWholeGen());

        //System.out.println();

        //Threaded
        startTime2 = System.currentTimeMillis();
        Rule30Threaded r1 = new Rule30Threaded(gridSize);
        r1.addGeneration();
        threadedTime = System.currentTimeMillis() - startTime2;
        System.out.println(r1.getWhole());

        System.out.println("Threaded Time : " + (threadedTime) + "ms");
        //System.out.println("Non Threaded Time : " + (nonThreadedTime) + "ms");
      //  System.out.println("difference : " + (threadedTime - nonThreadedTime) + "ms");

    }
}
