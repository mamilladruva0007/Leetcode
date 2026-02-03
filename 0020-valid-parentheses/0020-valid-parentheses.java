
class Solution {
    public boolean isValid(String s) {
        Stack<Character> si = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (c == '(' || c == '[' || c == '{') {
                si.push(c);
            } 
           
            else {
                if (si.isEmpty()) return false;

                char top = si.pop();

                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {
                        continue;
                }else{
                    return false;
                }
            }
        }

        return si.isEmpty();
    }
}
