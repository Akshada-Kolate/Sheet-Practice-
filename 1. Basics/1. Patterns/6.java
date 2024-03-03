java -cp /tmp/HaFUnQ47qG PrintPattern
12345
1234
123
12
1


************************************  

import java.lang.*;
import java.util.*;
 
public class PrintPattern {

    public static void main(String[] args) {
        int rows = 5;

     for(int i=rows;i>=1 ; i--){
         for(int j=1;j<=i; j++){
             System.out.print(j);
         }
         System.out.println();
     }
    }
}
