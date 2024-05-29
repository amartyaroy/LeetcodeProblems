class Solution {
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] arr, int k) {
        
       if(k<arr.length){
            //reversing the whole array;
            reverse(arr, 0, arr.length-1);
            //reversing from 0 to k-1
            reverse(arr, 0, k-1);
            //reversing from k to n-1
            reverse(arr, k, arr.length-1);
        }else{
            k = k%arr.length;
            //reversing the whole array;
            reverse(arr, 0, arr.length-1);
            //reversing from 0 to k-1
            reverse(arr, 0, k-1);
            //reversing from k to n-1
            reverse(arr, k, arr.length-1);
        }
      
    }
}