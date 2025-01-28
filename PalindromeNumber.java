public class PalindromeNumber {
        public boolean isPalindrome(int x) {
            int ori = x;
            int rem = 0;
            while(x>0){
                int digit = x % 10;
                rem = rem * 10 + digit;
                x = x/10; 
            }
            if(rem==ori){
                return true;
            }
            return false;
        }
    }
