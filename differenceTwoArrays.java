class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> numsList1 = new ArrayList<>();
        ArrayList<Integer> numsList2 = new ArrayList<>();
        ArrayList<List<Integer>> mergedList = new ArrayList<>();
        Set<Integer> numsSet1 = new HashSet<>();
        Set<Integer> numsSet2 = new HashSet<>();

        for( int num1 : nums1) {
            numsSet1.add(num1);
        }

        for (int num2 : nums2) {
            numsSet2.add(num2);
        }

        Set<Integer> diffSet1 = new HashSet<>(numsSet1);
        Set<Integer> diffSet2 = new HashSet<>(numsSet2);

        diffSet1.removeAll(diffSet2);
        diffSet2.removeAll(numsSet1);

        Integer[] nums1Array = diffSet1.toArray(new Integer[0]);
        Integer[] nums2Array = diffSet2.toArray(new Integer[0]);

        for (int el1 : nums1Array) {
            numsList1.add(el1);
        }

        for (int el2 : nums2Array) {
            numsList2.add(el2);
        }

        mergedList.add(numsList1);
        mergedList.add(numsList2);

        return mergedList;




    }
}
