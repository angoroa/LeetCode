class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] s3 = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        int index = 0, outdex=0;
        while(index < t.length()&& outdex < s.length()){
            if (t.charAt(index) != s.charAt(outdex)) index++;
            else {
                sb.append(t.charAt(index));
                index++;
                outdex++;
            }
        }
        if (sb.toString().equals(s)) return true;
        else return false;
        
    }
}