class Solution {
    public int[] plusOne(int[] digit) {
      //int[] digit = {9,9};
        int last = digit.length - 1;
        int count = 0;
        for (int i = last; i >= 0; i--) {
            if (digit[i] == 9) {
                count++;
            } else {
                break;
            }
        }
       // System.out.println("coutn-"+count);
        if (count == digit.length) {
         
            int temp = count;
            int n[] = new int[last + 2];
            for (int j = last + 1; j >= 0; j--) {
                if (temp > 0) {
                    n[j] = 0;
                } else if (temp == 0) {
                    n[j] = 1;
                } else {
                    n[j] = digit[j];
                }
                temp--;

            }
           
             return n;
        } else if (count < digit.length) {
        //    System.out.println("tjis run");
            int temp = count;
          //  int n[] = new int[last + 1];
            for (int j = last; j >= 0; j--) {
                    if(temp>0)
                    {
                        digit[j]=0;
                    }
                    else
                    {
                        digit[j]++;
                        break;
                    }
               temp--;
            }
           
            return digit;
        } else {
            // System.out.println(digit[last]);
            digit[last] = digit[last] + 1;
           return digit;
        }
        
    }
}