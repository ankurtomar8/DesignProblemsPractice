package IntermmediateOneRefresher.PrefixSum;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr  = {-3,6,2,4,5,2,8,-9,3,1};

        int n = arr.length;
        int start = 2;
        int end = 7;
        int queries = 2;
        // brute force
        for (int j = 1; j <= queries; j++) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
        // Optimized version
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int j = 1; j <= queries; j++) {
           int sum = 0;
            if(start == 0){
                sum = prefixSum[end];
            }else{
                sum = prefixSum[end] - prefixSum[start-1];
            }
            System.out.println("Prefix Sum array "+sum);
        }
    }
}
