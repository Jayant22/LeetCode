class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)    return 0;
        if(needle.length() > haystack.length() || haystack.length() == 0)   return -1;
        
        char[] ndls = needle.toCharArray();
        char[] hay = haystack.toCharArray();
        int[] pat = new int[ndls.length];
        pat[0] = -1;
        for(int i = 1, k = -1; i < ndls.length; i++){
            while(k > -1 && ndls[k+1] != ndls[i])   k = pat[k];
            pat[i] = ndls[k+1] == ndls[i] ? ++k : k;
        }
        for(int i = 0, k = -1; i < hay.length; i++){
            while(k > -1 && ndls[k+1] != hay[i])   k = pat[k];
            if(ndls[k+1] == hay[i] && ++k == ndls.length - 1) return i - k;
        }
        
        return -1;
    }
}