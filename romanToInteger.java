class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;

        char[] romanArray = new char[s.length()];

        romanArray = s.toCharArray();

        for (int i = 0; i < romanArray.length; ++i) {
            int currentNumber = romanMap.get(romanArray[i]);

            if ((i+1) != romanArray.length && (currentNumber == 1 && romanArray[i+1] == 'V')) {
                currentNumber = 4;
                ++i;
            } else if ((i+1) != romanArray.length && (currentNumber == 1 && romanArray[i+1] == 'X')) {
                currentNumber = 9;
                ++i;
            } else if ((i+1) != romanArray.length && (currentNumber == 10 && romanArray[i+1] == 'L')) {
                currentNumber = 40;
                ++i;
            } else if ((i+1) != romanArray.length && (currentNumber == 10 && romanArray[i+1] == 'C')) {
                currentNumber = 90;
                ++i;
            } else if ((i+1) != romanArray.length && (currentNumber == 100 && romanArray[i+1] == 'D')) {
                currentNumber = 400;
                ++i;
            } else if ((i+1) != romanArray.length && (currentNumber == 100 && romanArray[i+1] == 'M')) {
                currentNumber = 900;
                ++i;
            }

            sum += currentNumber;
        }

        return sum;

    }
}
