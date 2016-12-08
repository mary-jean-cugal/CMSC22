
package rule30.threaded;

import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Mary Jean Cugal
 */
public class Rule30Threaded{

    final static int Threads = 10;
    String whole = "";//the whole generations
    int size;
    String noChild = "0";
    String hasChild = "1";
    Rule30Threaded(int size){//creation of the first generation
        this.size = size;
        for (int i = 0; i < size - 1; i++){
            
            if (i == size / 2){
                whole+= hasChild;
            }
            whole+= noChild;
        }
    }
    
//    public void join(int threadDiv, Generation[] a){
//        for(int i = 0; i < threadDiv; i++){
//            while(a[i].isAlive()){
//                try{
//                    a[i].join();
//                }catch(InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    public void print(int threadCount, String firstG, Generation[] a){
//        String str = "";
//        for (int i = 0; i < threadCount; i++){
//            
//        }
//        firstG += "\n" + str;
//    }
    
   public void addGeneration(){
       int threadCount;
       if (Threads > size){
           threadCount = size;
       }else{
           threadCount = Threads;
       }
       String rule30 = "";
       int start;
       String prevGen = whole; 
       Generation[] gens = new Generation[threadCount];
       int threadDiv = size / threadCount;
       for (int i = 0; i < size; i++){
           start = 0;
           for (int j = 0; j < threadCount - 1; j++){
               gens[j] = new Generation(prevGen, start, start + threadDiv);//0 base indexing of start
               start += threadDiv;
           }
            gens[threadCount - 1] = new Generation(prevGen, start, size - 1);
            
           for (int k = 0; k < threadCount; k++){
               gens[k].start();
           }
           
           for (int l = 0; l < threadCount; l++){
               while(gens[l].isAlive()){
                   try{
                       gens[i].join();
                   }catch(InterruptedException e){
                       e.printStackTrace();
                   }
               }
           }
           for(int l = 0; l < threadCount; l++){
               rule30+=gens[i].getNewGen();
              // System.out.println(gens[i].getNewGen());
           }
           whole += "\n" + rule30;
           //i++;
       }
   }
   String getWhole(){
        return whole;
    }

}
