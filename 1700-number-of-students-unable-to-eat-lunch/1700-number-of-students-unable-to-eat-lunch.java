class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
     int[] count = new int[2];

        for (int student : students)
            count[student]++;

        int remain = sandwiches.length;
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0)
                break;

            if (remain == 0)
                break;

            count[sandwich]--;
            remain--;
        }

        return remain;   
    }
}