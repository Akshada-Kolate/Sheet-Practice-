Problem statement
You are given a number 'n'.



Return number of digits in ‘n’.



Example:
Input: 'n' = 123

Output: 3

Explanation:
The 3 digits in ‘123’ are 1, 2 and 3. 


  ***************************************************

  public class Solution {
    
    public static void main(String[] args){
       
       int n = 123345;
       int count = 0;
       
       while(n != 0){
          n = n / 10;
          count++;
       }
       System.out.print(count);
    }
}
