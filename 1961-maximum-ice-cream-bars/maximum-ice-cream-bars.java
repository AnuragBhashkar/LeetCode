class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int ele:costs){
            if(ele<=coins){
                coins-=ele;
                count++;
            }
            else if(ele>coins) break;
        }
        return count;
    }
}