
package rule30.threaded;

/**
 *
 * @author Mary Jean Cugal
 */
public class nonThreaded {
    String gen = "";
    int size;
    String noChild = "0";
    String hasChild = "1";
    nonThreaded(int size){//creation of the first generation
        this.size = size;
        for (int i = 0; i < size -1; i++){
            gen= gen + "0";
            if (i == size / 2){
                gen+= "1";
            }
        }
    }
    String rule(String parents){
         if((parents.charAt(0) == '1' && parents.charAt(1) == '0' && parents.charAt(2) == '0') ||
           (parents.charAt(0) == '0' && parents.charAt(1) == '1' && parents.charAt(2) == '1') ||
           (parents.charAt(0) == '0' && parents.charAt(1) == '1' && parents.charAt(2) == '0') ||
           (parents.charAt(0) == '0' && parents.charAt(1) == '0' && parents.charAt(2) == '1')){
            return "1";
        
        }else{
            return "0";
        }
    }
    void createGen(){
        String generation = gen;
        String res;
        for (int i = 0; i < size - 1; i++){
            res = "";
            for (int j= 0; j < size; j++){
                if (j == 0){
                    res+= rule("0" + generation.substring(j, j + 2));
                }else if (j == size - 1){
                    res+=rule(generation.substring(j - 1) + "0");
                }else{
                    res+=rule(generation.substring(j - 1, j + 2));
                }
            }
            generation = res;
            gen +="\n" + generation;
        }
       
    }
    
    String showWholeGen(){
        return gen;
    }
}
