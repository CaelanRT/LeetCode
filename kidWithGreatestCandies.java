class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] boolArray = new boolean[candies.length];
        int tempAmount = 0;

        for (int i = 0; i < candies.length; ++i) {
            tempAmount = candies[i] + extraCandies;
            boolean flag = true;
            for (int j = 0; j < candies.length; ++j) {
                if (j == i) {
                    continue;
                }
                if (tempAmount < candies[j]) {
                    flag = false;
                    break;
                }
            }
            boolArray[i] = flag;
        }

        ArrayList<Boolean> boolList = new ArrayList<>();

        for (boolean b : boolArray) {
            boolList.add(b);
        }


        return boolList;

    }
}
