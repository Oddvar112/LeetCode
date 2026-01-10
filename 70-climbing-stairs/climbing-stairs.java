import java.util.ArrayList;

class Solution {
    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); 
        list.add(2); 

        for (int i = 2; i < n; i++) {
            int tall = list.get(i - 1) + list.get(i - 2);
            list.add(tall);
        }

        return list.get(n - 1);
    }
}
