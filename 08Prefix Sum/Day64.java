// Question : Product array puzzle


class Solution {
    public static long[] productExceptSelf(int arr[], int n) {
        long[] left = new long[n];
        long[] right = new long[n];
        long[] result = new long[n];

        // Fill left product array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        // Fill right product array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i + 1] * right[i + 1];
        }

        // Construct result array
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}

