class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer a = new StringBuffer(Integer.toString(x));
        if (a.toString().equals(a.reverse().toString())) {
            return true;
        }

        return false;

    }
}