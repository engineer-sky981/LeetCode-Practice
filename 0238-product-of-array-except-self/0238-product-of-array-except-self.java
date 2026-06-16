class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Sabhi elements ko pehle 1 se fill kar dein
        Arrays.fill(answer, 1);

        int prefix = 1;
        int suffix = 1;

        // Single loop mein left aur right dono sweep ek sath chalenge
        for (int i = 0; i < n; i++) {
            // Left side se product multiply karein
            answer[i] *= prefix;
            prefix *= nums[i];

            // Right side se product multiply karein
            answer[n - 1 - i] *= suffix;
            suffix *= nums[n - 1 - i];
        }

        return answer;
    }
}