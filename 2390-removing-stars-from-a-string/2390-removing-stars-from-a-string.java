class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < s.length()){
            if (s.charAt(index) != '*'){
                stack.push(s.charAt(index));
                index++;
            }
            else {
                stack.pop();
                index++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < stack.size(); i++){
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
}