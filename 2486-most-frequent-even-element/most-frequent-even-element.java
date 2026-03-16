class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele : nums){
            if(ele % 2 == 0){
                map.put(ele, map.getOrDefault(ele,0)+1);
            }
        }

        int maxFreq = 0;  
        int ans = -1;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFreq || (freq == maxFreq && num < ans)){
                maxFreq = freq;
                ans = num;
            }
        }
        return ans;
    }
}