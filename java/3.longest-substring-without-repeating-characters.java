public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int j = 0;
        if(s == null || s.equals(""))
        {
            return length;
        }
        for(int i = 0; i < s.length(); i++)
        {
           int[] ascii = new int[256];
           for(j = i; j < s.length(); j++)
           {
               if(ascii[s.charAt(j)] == 0)
               {
                   ascii[s.charAt(j)] = 1;
               }
               else
               {
                   break;
               }
           }
           if(length < j - i)
           {
               length = j - i;
           }
        }
        return length;
    }
}
