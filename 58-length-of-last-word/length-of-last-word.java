class Solution {
    public int lengthOfLastWord(String s) {
        String vasket = s.trim();
        String[] deler = vasket.split(" ");
        return deler[deler.length - 1].length();
    }
}