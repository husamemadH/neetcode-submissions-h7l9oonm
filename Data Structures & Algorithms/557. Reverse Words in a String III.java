class Solution {
    private void reverse(char[] arr , int start , int end) {
        while(start < end) {
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        
        for(int end = 0 ; end < arr.length ; end++) {
         int start = end;

            while(end < arr.length && arr[end] != ' ') {
                end++;
            }

            reverse(arr , start , end - 1);
            
        }

        return new String(arr);
    }

}
