class Solution {
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        int j = 0;
        String str = "";

        while( i >= 0){
            if((num.charAt(i) - '0') % 2 != 0){
                return num.substring(0, i+1);
            }
             else{
                i --;
            }
        }
        return str;
    }
}