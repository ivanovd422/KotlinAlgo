package learn.sorting


// Bubble Sort -  O(n2)
fun bubbleSort(nums: IntArray): IntArray {
    for(i in 0..nums.size-1) {
        for(j in nums.size-1 downTo i+1) {
            if(nums[j-1] > nums[j]) {
                nums[j-1] = nums[j].also{ nums[j] = nums[j-1]}
            }
        }
    }
    return nums
}