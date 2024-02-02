class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            int number=i;
            int nextdigit=i+1;
            
            while(number <= high && nextdigit <= 9)
            {
                number=number*10+nextdigit;
                if(low<=number && number<=high)
                {
                    arr.add(number);
                }
                nextdigit++;
            }
        }
        Collections.sort(arr);
        return arr;

        }
}