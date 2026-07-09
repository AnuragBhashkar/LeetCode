class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> st=new ArrayDeque<>();
        int[] arr=new int[nums2.length];
        arr[nums2.length-1]=-1;
        st.push(nums2[nums2.length-1]);
        
        for(int i=nums2.length-2;i>=0;i--){
            int ele=nums2[i];
            while(!st.isEmpty() && ele>st.peek()) st.pop();
            if(st.isEmpty()) arr[i]=-1;
            else arr[i]=st.peek();
            st.push(ele);
        }

        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res[i]=arr[j];
                }
            }
        }
        return res; 
    }
}