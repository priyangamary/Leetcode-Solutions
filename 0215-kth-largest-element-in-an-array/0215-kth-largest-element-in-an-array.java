class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        // Create a Min Heap (default in Java)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num); // Add current element

            // Keep only k largest elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest
            }
        }

        // Top of the heap is the K'th largest element
        return minHeap.peek();
    }
}