class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        String ord = String.valueOf(x); 

        for(int i = 0;i< ord.length(); i++){

            if(ord.charAt(i)!=ord.charAt(ord.length()-i-1)){
                return false; 
            }

        }
        
        return true;
    
    }
}