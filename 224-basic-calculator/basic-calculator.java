class Solution {
    public int calculate(String s) {
        Stack<Integer> nums=new Stack<>();
        Stack<Character> ops=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch==' '){
                i++;
                continue;
            }
            if(Character.isDigit(ch)){
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=(num*10)+(s.charAt(i)-'0');
                    i++;
                }
                nums.push(num);
                continue;
            }
            if(ch=='('){
                ops.push(ch);
            }
            else if(ch=='+' || ch=='-'){
                int j = i - 1;
                while (j >= 0 && s.charAt(j) == ' ') j--;
                if (j < 0 || s.charAt(j) == '(') {
                    nums.push(0);
                }
                while (!ops.isEmpty() && ops.peek() != '(') {
                    evaluate(nums, ops);
                }
                ops.push(ch);
            }
            else if(ch==')'){
                while(!ops.isEmpty() && ops.peek()!='('){
                    evaluate(nums,ops);
                }
                ops.pop();
            }
            i++;
        }
        while(!ops.isEmpty()) evaluate(nums,ops);
        return nums.pop();
    }
    private void evaluate(Stack<Integer> nums,Stack<Character> ops){
        int b=nums.pop();
        int a=nums.pop();
        char op=ops.pop();
        if(op=='+') nums.push(a+b);
        else nums.push(a-b);
    }
}