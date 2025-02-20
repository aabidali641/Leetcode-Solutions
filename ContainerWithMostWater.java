class ContainerWithMostWater {  // ✅ Correct class name format
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1; // Two pointers
        int maxArea = 0; // Variable to store the maximum area

        while (left < right) {
            // Calculate the current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea); // Update the maximum area

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
