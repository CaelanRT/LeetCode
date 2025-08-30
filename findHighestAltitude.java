class Solution {
    public int largestAltitude(int[] gain) {
        int[] pointArray = new int[gain.length+1];
        int altitude = 0;
        
        pointArray[0] = altitude;

        for (int i = 1; i < pointArray.length; ++i) {
            altitude += gain[i-1];
            pointArray[i] = altitude;
        }

        int max = pointArray[0];

        for (int j = 1; j < pointArray.length; ++j) {
            if (pointArray[j] > max) {
                max = pointArray[j];
            }
        }

        return max;

    }
}
