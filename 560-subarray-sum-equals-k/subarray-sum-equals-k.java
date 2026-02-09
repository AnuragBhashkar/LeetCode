class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        //prefix:
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int ele=nums[i];
            if(ele==k) count++;
            //remainder=pre[i]-k wala logic:
            int rem=nums[i]-k;
            if(map.containsKey(rem)) count+=map.get(rem);
            //CHECKING if "ele" is present:
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        return count;        
    }
}