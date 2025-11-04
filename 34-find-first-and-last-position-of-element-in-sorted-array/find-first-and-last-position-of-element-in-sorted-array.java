class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int ele : nums){
            list.add(ele);
        }
        first=list.indexOf(target);
        last=list.lastIndexOf(target);
        return new int[]{first,last};
    }
}