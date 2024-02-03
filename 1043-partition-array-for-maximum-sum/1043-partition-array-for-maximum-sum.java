class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n= arr.length, arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=1;j<=k && i-j+1>=0;j++)
            {
                max=Math.max(max,arr[i-j+1]);
                arr1[i]=Math.max(arr1[i],(i>=j? arr1[i-j]:0)+ max*j);
                    
            }
        }
        return arr1[n-1];
    }
}