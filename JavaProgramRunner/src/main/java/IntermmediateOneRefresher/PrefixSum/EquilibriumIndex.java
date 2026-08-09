package IntermmediateOneRefresher.PrefixSum;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] arr  = {1,2,3,4,8,10};
        int n = arr.length;
        int start = 2;
        int end = n-1 ;
        int queries = 2;

        // build prefix sum array
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int j = 1; j <= queries; j++) {
            int sum = 0;
            // Example query logic using start and end
            if(start == 0){
                sum = prefixSum[end];
            }else{
                sum = prefixSum[end] - prefixSum[start-1];
            }
            System.out.println("Prefix Sum array "+sum);
        }

        // then check Equilibrium index
        // pf[i-1] == pf[n-1] - pf[i] return i
        int equilibriumIndex = -1;
        for (int i = 0; i < n; i++) {
            long leftSum = 0;
            if (i > 0) {
                leftSum = prefixSum[i - 1];
            }

            long rightSum = prefixSum[n - 1] - prefixSum[i];

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
        }

        if (equilibriumIndex != -1) {
            System.out.println("First Equilibrium Index found at: " + equilibriumIndex);
        } else {
            System.out.println("No Equilibrium Index found.");
        }

    }
}
