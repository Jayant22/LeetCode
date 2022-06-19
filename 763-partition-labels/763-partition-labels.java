class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), i);
        
        List<Integer> list = new ArrayList<Integer>();
        int perv = -1, max = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            
            if(max == i){
                list.add(max - perv);
                perv = max;
            }
        }
        
        return list;
    }
}