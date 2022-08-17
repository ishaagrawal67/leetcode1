class Solution {
    public void sortColors(int[] num) {
        int n=num.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if (num[mid]==0)
            {
                swap(num,low,mid);
                low++;
                mid++;
            }
            else if (num[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(num,mid,high);
                 
                high--;;
            }
        }
    }
    private void swap(int []num, int a, int b){
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}