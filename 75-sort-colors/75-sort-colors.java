class Solution {
    public void sortColors(int[] num) {
        // your logic can not use extra space it is a mean of in place sorting
        //visiting all the value sequentially is c/d traversal
        // when two pass solution convert in one pass solution itm is cld three poinatapproach
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