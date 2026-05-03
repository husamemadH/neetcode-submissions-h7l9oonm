class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 1 ; i <= nums.length ; i++) {
            set.add(i);
        }

        for(int num : nums) {

            if(set.contains(num)) {
                set.remove(num);
            }
        }

        for(int i : set) {
            list.add(i);
        }

        return list;
    }
}