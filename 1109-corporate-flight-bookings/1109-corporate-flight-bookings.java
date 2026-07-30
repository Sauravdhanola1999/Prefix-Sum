class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n+2];
        int[] result = new int[n];
        for(int[] book:bookings){
           int start = book[0];
            int end = book[1];
            int seat = book[2];
            diff[start]+=seat;
            diff[end+1]-=seat;
        }

        int cumSum =0;
        for(int i=1; i<=n; i++){
            cumSum+=diff[i];
            result[i-1]=cumSum;
        }
        return result;
    }
}