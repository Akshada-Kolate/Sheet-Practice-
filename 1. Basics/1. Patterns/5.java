java -cp /tmp/HaFUnQ47qG PrintPattern
*****
****
***
**
*

  
  ********************************************

import java.lang.*;
import java.util.*;
 
public class PrintPattern {

    public static void main(String[] args) {
        int rows = 5;

        for(int i= rows ; i>0 ; i--){
            for(int j=i; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
