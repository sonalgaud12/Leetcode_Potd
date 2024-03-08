class Solution {
    public int maxFrequencyElements(int[] nums) {
      Map<Integer, Integer> frqs = new HashMap<>();
    int maxFreq = 0, cntMaxFreq = 0;
    for (int num : nums) {
        int frq = frqs.getOrDefault(num, 0) + 1;
        if (frq == maxFreq) cntMaxFreq++;
        else if (frq > maxFreq) {
            maxFreq = frq;
            cntMaxFreq = 1;
        }
        frqs.put(num, frq);
    }
    return maxFreq * cntMaxFreq;   
    }
}