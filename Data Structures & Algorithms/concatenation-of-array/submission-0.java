class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> myList = new ArrayList<>();
        
        for(int n : nums ) {

            myList.add(n);
        }

        for(int n : nums) {
            myList.add(n);
        }

        return myList.stream().mapToInt(i -> i).toArray();
    }
}