class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int start = 0; int end = s.length()-1; 
        char CharArray[] = s.toCharArray();
        while(start<end){
            if(!isVowel(CharArray[start])) start++;
            else if(!isVowel(CharArray[end])) end--;
            else {
                char temp = CharArray[start];
                CharArray[start] = CharArray[end];
                CharArray[end] = temp;
                start ++;
                end --;
            }
        }
        return String.valueOf(CharArray);
    }
    public static boolean isVowel(char ch){
    if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
    return false;
    }

}
