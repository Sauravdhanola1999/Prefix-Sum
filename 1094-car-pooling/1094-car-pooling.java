class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int[] diff = new int[1002];

        for (int[] trip : trips) {
            int numPassengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            diff[from] += numPassengers;
            diff[to] -= numPassengers;
        }

        int currentPassengers = 0;

        for (int i = 0; i < diff.length; i++) {
            currentPassengers += diff[i];

            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }
}