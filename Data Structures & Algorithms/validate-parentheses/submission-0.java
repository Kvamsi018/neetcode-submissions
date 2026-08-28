class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> cTo = new HashMap<>();

        cTo.put(')', '(');
        cTo.put(']', '[');
        cTo.put('}', '{');

        for(char c : s.toCharArray()){
            if(cTo.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==cTo.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
