1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 

*****************************************************

import java.lang.*;
import java.util.*;
 
public class PrintPattern {

    public static void main(String[] args) {
        int rows = 5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
               if(j%2==1)
                    System.out.print("1 ");
                else 
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
