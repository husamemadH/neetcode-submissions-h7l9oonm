class Solution {
    public long dividePlayers(int[] skill) {
        long chemistry = 0;
        Arrays.sort(skill);

        int l = 0 , r = skill.length - 1;
        int equalSkill = skill[l] + skill[r];
        while(l < r) {
            
            if(skill[l] + skill[r] != equalSkill) 
                return -1;
                
            chemistry += skill[l] * skill[r];
            l++;
            r--;

        }

        return chemistry;
    }
}
