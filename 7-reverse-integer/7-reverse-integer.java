import java.util.*;
class Solution {
    public int reverse(int x) {
     long ans = 0;
    for(; x!=0; x/=10){
        ans = ans*10 + x%10;
    }
   
        return ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE ?0: (int) ans;
    }
}