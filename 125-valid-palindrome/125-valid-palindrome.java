class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        
        int left = 0, right = str.length() - 1;
        
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(str.charAt(left)))
                left++;
            
            while(left < right && !Character.isLetterOrDigit(str.charAt(right)))
                right--;
            
            
            if(str.charAt(left++) != str.charAt(right--))
                return false;
        }
        
        return true;
    }
}