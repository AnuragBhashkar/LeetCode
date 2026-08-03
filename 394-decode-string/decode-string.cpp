class Solution {
public:
    string decodeString(string s) {

        stack<string> st;
        stack<int> snum;
        string stemp="";
        string ans="";

        for (int i=0;i<s.size();i++){
            int num = 0;
            while (isdigit(s[i])){
                num = num*10 + (s[i]-'0');
                i++;
            }

            if (s[i]=='['){
                snum.push(num);
                st.push(stemp);
                stemp="";
            }
            else if (s[i]==']'){
                int n = snum.top();
                snum.pop();
                ans=st.top();
                st.pop();
                for (int i=0;i<n;i++){
                    ans = ans+ stemp ;
                }
                stemp=ans;
            }

            else stemp.push_back(s[i]);
        }
        return stemp;
    }
};