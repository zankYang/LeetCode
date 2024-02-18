/**
Given an integer x, return true if x is a 
palindrome
, and false otherwise.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        boolean isPalindrome = true;
        int input = -121;
        String[] inputText = String.valueOf(input).split("");


        for (int i = 0; i < inputText.length; i++) {
            if (!inputText[i].equals(inputText[inputText.length-1-i])) {
                isPalindrome=false;
            }
        }
        if (isPalindrome) {
            System.out.println("Si es palindromo");
        }else{
            System.out.println("No lo es");
        }
    } 
}