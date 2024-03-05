1      1
12    21
123  321
12344321


  *******************************

import java.lang.*;
import java.util.*;
 
 public class PrintPattern {

    public static void main(String[] args) {
        int rows = 4;

       for(int i = 1; i <= rows; i++){
           
           for(int j = 1; j<= i; j++){
               System.out.print(j);
           }
           
           for(int k=1; k<=(rows-i)*2;k++){
               System.out.print(" ");
           }
           
           for(int l=i; l>=1; l--){
               System.out.print(l);
           }
           System.out.println();
       }
    }
}
