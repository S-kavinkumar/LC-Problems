class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            int value = s.charAt(i) - 'a';
            int reverse = 26 - value;
            sum += reverse * (i+1);
        }

        return sum;
    }
}