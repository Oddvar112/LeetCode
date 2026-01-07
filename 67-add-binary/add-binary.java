class Solution {
    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        while (a.length() < maxLen) {
            a = "0" + a;
        }
        while (b.length() < maxLen) {
            b = "0" + b;
        }
        StringBuilder result = new StringBuilder();
        int mente = 0;
        
        for (int i = a.length() - 1; i >= 0; i--) {
            int digitA = a.charAt(i) - '0';
            int digitB = b.charAt(i) - '0';
            
            int sum = digitA + digitB + mente;
            result.append(sum % 2);
            mente = sum / 2;
        }
        
        if (mente == 1) {
            result.append(1);
        }
        
        return result.reverse().toString();
    }
}