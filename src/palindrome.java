public class palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    /**
     * Returns true if number if a palindrome
     *
     * @param number the number to check
     * @return true if a palindrome. False if not
     */
    public static boolean isPalindrome(int number){
        number = Math.abs(number);

        int numberClone = number;
        int reverse = 0;

        /*

        Find the last digit of number with %.   number % 10 = right most digit
        move reverse to the left. Multiply by ten. reverse *= 10;
        Add last digit to reverse;

        Repeat while number > 0
            lastDigit = number % 10
            reverse *= 10
            reverse += lastDigit
            number /= 10
         */

        while (number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        return reverse == numberClone;



    }

}
