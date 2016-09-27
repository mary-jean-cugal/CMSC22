yayyyyyyy!!!!!!!!!
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
     public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
   
	public static void main (String[] args) throws java.lang.Exception
	{
// 		Scanner sc = new Scanner(System.in);
// 		int  size =  sc.nextInt();
        int size = 10;
	    int remr, remc;
	   int[][] twoDm = new int[size][size];
	   twoDm[0][size / 2] = 1;
	   int r = 0, c = size / 2;
	   for (int i = 0; i < size; i++){
	       for (int j = 0; j < size; j++){
	           //if (size % 2 == 1){
	           //    twoDm[(size / 2)][size - 1] = 1;
	           //}else{
	           //    twoDm[((size / 2) - 1)][size - 1] = 1;
	           //}
                // if (c >= 0 && r < ((size / 2) + 1)){
                //     twoDm[r++][c--] = 1;
                // }
                if ((i < size - 1) && j == 0){
                     if (twoDm[i][j] == 0 && twoDm[i][j + 1] == 0){
                            
                        twoDm[i + 1][j] = 0;
                       
                        
                    }else if ((twoDm[i][j] == 1 && twoDm[i][j + 1] == 1) ||
                             (twoDm[i][j] == 1 && twoDm[i][j + 1] == 0) ||
                             (twoDm[i][j] == 0 && twoDm[i][j + 1] == 1)){
                              twoDm[i + 1][j] = 1;
                    }	           
	            }
	           else if ((i < size - 1) && (j > 0 && j < size - 1)){
	                if ((twoDm[i][j - 1] == 1 && twoDm[i][j] == 1 && twoDm[i][j + 1] == 1) || 
                        (twoDm[i][j - 1] == 1 && twoDm[i][j] == 1 && twoDm[i][j + 1] == 0) ||
                        (twoDm[i][j - 1] == 1 && twoDm[i][j] == 0 && twoDm[i][j + 1] == 1) ||
                        (twoDm[i][j - 1] == 0 && twoDm[i][j] == 0 && twoDm[i][j + 1] == 0) ){
                            
                        twoDm[i + 1][j] = 0;
                       
                        
                    }else if ((twoDm[i][j -1] == 1 && twoDm[i][j] == 0 && twoDm[i][j + 1] == 0) ||
                              (twoDm[i][j -1] == 0 && twoDm[i][j] == 1 && twoDm[i][j + 1] == 1) ||
                              (twoDm[i][j -1] == 0 && twoDm[i][j] == 1 && twoDm[i][j + 1] == 0) ||
                              (twoDm[i][j -1] == 0 && twoDm[i][j] == 0 && twoDm[i][j + 1] == 1)){
                         
                                  
                         twoDm[i + 1][j] = 1;
                    }
	            }else if (i < size - 1 && j == size - 1){
	                
	                if ( (twoDm[i][j - 1] == 1 && twoDm[i][j] == 1) ||
                         (twoDm[i][j - 1] == 0 && twoDm[i][j] == 0)){
                            twoDm[i + 1][j] = 0;
                    }
                    else if ( (twoDm[i][j -1] == 1 && twoDm[i][j] == 0) ||
                              (twoDm[i][j -1] == 0 && twoDm[i][j] == 1)){
                         
                                  
                         twoDm[i + 1][j] = 1;
                    }
                            
	            }
	       }
	   }
        for(int[] row : twoDm) {
            printRow(row);
        }
	}
}