class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> group = new HashMap<>();
        String[] sortS = new String[strs.length];

        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);
            sortS[i] = sorted;
        }

        for(int i=0;i<sortS.length;i++){
            if(group.containsKey(sortS[i])){
                group.get(sortS[i]).add(strs[i]);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                group.put(sortS[i],list);
            }
        }

        return new ArrayList<>(group.values());
    }
}
