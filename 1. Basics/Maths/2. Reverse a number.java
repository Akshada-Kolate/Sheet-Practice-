Example 1:
Input: N = 123
Output: 321
Explanation: The reverse of 123 is 321

Example 2:
Input: N = 234
Output: 432
Explanation: The reverse of 234 is 432

  **********************************************************

  public class Solution {
    
    public static void main(String[] args){
       
       int n = 123;
       int ans =0;
       
       while(n!=0){
           int m = n%10;
           ans = ans*10+m;
           n = n/10;
       }
       
       System.out.print(ans);
    }
}
