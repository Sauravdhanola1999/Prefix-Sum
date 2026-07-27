class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;

        long ans = 0;
        int even = 1;
        int odd = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }

            ans %= MOD;
        }

        return (int) ans;
    }
}