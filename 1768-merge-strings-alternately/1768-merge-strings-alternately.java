class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder merged = new StringBuilder();
        if(word1.length() == word2.length()){
            for(int i=0; i<word1.length(); i++){
                merged.append(word1.charAt(i));
                merged.append(word2.charAt(i));
            }
        }
        else if(word1.length()> word2.length()){
            for(int i=0; i<word2.length(); i++){
                merged.append(word1.charAt(i));
                merged.append(word2.charAt(i));
            }
            for(int i= word2.length(); i<word1.length(); i++){
                merged.append(word1.charAt(i));
            }

        }
        else{
            for(int i=0; i<word1.length(); i++){
                merged.append(word1.charAt(i));
                merged.append(word2.charAt(i));
            }
            for(int i=word1.length(); i<word2.length(); i++){
                merged.append(word2.charAt(i));
            }
        }
    return merged.toString();
    
    }
}