// definitely rusty on string builder lmao

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Array = new char[word1.length()];
        char[] word2Array = new char[word2.length()];

        word1Array = word1.toCharArray();
        word2Array = word2.toCharArray();

        ArrayList<Character> mergedArray = new ArrayList<>();

        int stop = 0;

        if (word1.length() > word2.length()) {
            stop = word2.length();
        } else if (word2.length() > word1.length()) {
            stop = word1.length();
        } else {
            stop = word1.length();
        }

        for (int i = 0; i < stop; ++i) {
            mergedArray.add(word1Array[i]);
            mergedArray.add(word2Array[i]);
        }

        if (word1.length() > word2.length()) {
            for (int j = stop; j < word1.length(); ++j) {
                mergedArray.add(word1Array[j]);
            }
        } else if (word2.length() > word1.length()) {
            for (int k = stop; k < word2.length(); ++k) {
                mergedArray.add(word2Array[k]);
            }
        }

        StringBuilder builder = new StringBuilder(mergedArray.size());
        for (Character ch : mergedArray) {
            builder.append(ch);
        }

        String mergedWord = builder.toString();

        return mergedWord;












    }
}
