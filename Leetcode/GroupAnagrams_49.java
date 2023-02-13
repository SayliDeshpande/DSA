class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*if(strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<>();
        
        for(String s : strs){
            char[] sc = s.toCharArray();
            Arrays.sort(sc);
            String key = String.valueOf(sc);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
        */

        if(strs.length == 0 || strs == null) return new ArrayList();
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }
            if(map.containsKey(str))
        }
    }
}
