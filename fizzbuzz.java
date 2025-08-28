
class Solution {
    public List<String> fizzBuzz(int n) {

        String[] output = new String[n];

        int l = output.length;

        for (int i = 0; i < l; ++i) {
            int number = i + 1;
            if (((number % 3) == 0) && ((number % 5) == 0) && (number != 0)) {
                output[i] = "FizzBuzz";
            } else if (((number % 3) == 0) && (number != 0)) {
                output[i] = "Fizz";
            } else if (((number % 5) == 0) && (number != 0)) {
                output[i] = "Buzz";
            } else {
                output[i] = Integer.toString(number);
            }   
        }

        List<String> outputList = Arrays.asList(output);
        return outputList;
    }
}
