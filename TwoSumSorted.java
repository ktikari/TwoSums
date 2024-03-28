public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Return the indices + 1 since the problem expects 1-indexed results
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // Return an empty array if no solution is found
        // (The problem statement guarantees one solution,
        // so this should theoretically never be reached)
        return new int[] {};
    }
    
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        
        // Printing the result
        if (result.length == 2) {
            System.out.println("Index1: " + result[0] + ", Index2: " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
