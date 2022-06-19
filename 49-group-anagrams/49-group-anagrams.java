class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap<>();
        
        for (String str : strs) {
            char[] chArray = str.toCharArray();
            Arrays.sort(chArray);
            String temp = new String(chArray);
            if (!anagrams.containsKey(temp)) {
                anagrams.put(temp, new ArrayList<>());
            }
           anagrams.get(temp).add(str);
            
            
        }
        result.addAll(anagrams.values());
        return result;
        
    }
}