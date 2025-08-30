class RecentCounter {
    Queue<Integer> pings = null;
    public RecentCounter() {
        pings = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        pings.offer(t);
        int count = 0;
        int low = t - 3000;

        for (int num : pings) {
            if (num >= low && num <= t ) {
                count++;
            }
        }

        return count;

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
