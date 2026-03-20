class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int lo=0,hi=people.length-1;
        while(lo<=hi){
            if(people[lo]+people[hi]>limit){
                count++;
                hi--;
            }
            else{
                count++;
                hi--;
                lo++;
            }
        }
        return count;
    }
}