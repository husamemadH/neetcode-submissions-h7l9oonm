class Solution {
    public int countElements(int[] arr) {
        int count = 0;

        Set<Integer> set = new HashSet<>();

        for(int n : arr) {
            set.add(n);
        }

        for(int n : arr) {
            if(set.contains(n+1))
            count++;
        }

        return count;
    }
}
