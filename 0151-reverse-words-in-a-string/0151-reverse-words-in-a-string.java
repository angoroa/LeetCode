class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] words = s.split("\\s+");
        for (int i=0; i< words.length/2; i++){
            String temp = words[words.length-1-i];
            words[words.length-1-i] = words[i];
            words[i] = temp;
        }
        String result = String.join(" ",words);
        return result;

    }
}