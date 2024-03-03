import java.lang.*;
import java.util.*;
 
public class PrintPattern {

    public static void main(String[] args) {
        int rows=5;
        int c=1;
        int space = rows-1;
        
        for(int i=0;i<rows;i++){
            for(int j=space; j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=c;k++){
                System.out.print("*");
            }
            c+=2;
            space--;
            System.out.println();
        }
        
    }
}
