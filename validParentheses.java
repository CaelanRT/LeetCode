class Solution {
    public boolean isValid(String s) {
        char[] charArray = new char[s.length()];
        boolean isValid = true;

        charArray = s.toCharArray();
        Stack<Character> charStack = new Stack<>();

        if (charArray.length == 1) {
            return isValid = false;        
        }

        for (int i = 0; i < charArray.length; ++i) {

            if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') {
                charStack.push(charArray[i]);
                //checking if we have a closing bracket
            } else {
                if (charStack.empty()) {
                    return isValid = false;
                } else {
                    char currentPop = charStack.pop();
                    if ((currentPop == '(' && charArray[i] != ')') || (currentPop == '{' && charArray[i] != '}') || (currentPop == '[' && charArray[i] != ']')) {
                        return isValid = false;
                    }
                }
            }


        }

        if (!charStack.empty()) {
            return isValid = false;
        }


        return isValid;




    }
}
