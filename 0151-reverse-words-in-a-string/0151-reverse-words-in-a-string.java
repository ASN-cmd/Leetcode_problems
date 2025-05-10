import java.util.*;

class Solution {
    public String reverseWords(String s) {
       String[] str = s.trim().split("\\s+");
       String rev = "";

       for(int i = str.length - 1; i>=0; i--){

        //empty
        if(s.length() == 0){
            continue;
        }
        
        if(rev.length() == 0){
            rev += str[i];
        }
        else{
            rev += " " + str[i];
        }
       }
       return rev;
    }

}