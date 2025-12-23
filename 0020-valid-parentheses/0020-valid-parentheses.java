class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] arr = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                arr[++top] = c;
            } 
            else {
                if (top == -1){ 
                    return false;
                }
                char open = arr[top--];
                if ((c == ')' && open != '(') ||(c == '}' && open != '{') || (c == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
