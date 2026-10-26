package TwoPointers;

public class MostWater {
    /*
     * Problem: Container With Most Water - given heights of vertical lines, find two lines that hold the most water
     */
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 1};

        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while(left < right)
        {
            int width = right - left;
            int h = Math.min(height[left], height[right]);   // water level = shorter line
            maxWater = Math.max(maxWater, width * h);

            if(height[left] < height[right])
                left++;      // move the shorter line, hoping to find a taller one
            else
                right--;
        }

        System.out.println("Max water: " + maxWater);
    }
}
