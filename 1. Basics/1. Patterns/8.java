
*********
 *******
  *****
   ***
    *



*********************************************************


import java.lang.*;
import java.util.*;
 
public class PrintPattern {

    public static void main(String[] args) {
        int rows=5;
        int space=0;
        int ch=rows*2-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<ch;k++){
                System.out.print("*");
            }
            System.out.println();
            space++;
            ch-=2;
        }
    }
}
