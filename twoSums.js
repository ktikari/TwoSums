function twoSumSorted(numbers, target) {
    let left = 0;
    let right = numbers.length - 1;
    
    while (left < right) {
        const currentSum = numbers[left] + numbers[right];
        if (currentSum === target) {
            // Convert to 1-indexed
            return [left + 1, right + 1];
        } else if (currentSum < target) {
            left += 1;
        } else {
            right -= 1;
        }
    }
    
    return [];
}

// Example usage
const numbers = [2, 7, 11, 15];
const target = 9;
console.log(twoSumSorted(numbers, target));
