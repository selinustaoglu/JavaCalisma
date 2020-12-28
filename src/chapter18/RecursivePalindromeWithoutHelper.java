package chapter18;

public class RecursivePalindromeWithoutHelper {
	public static boolean isPalindrome(String s) {
		if (s.length() < 2)
			return true;
		
		if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
			return false;
		
		return isPalindrome(s.substring(1, s.length() - 1));
	}

	public static void main(String[] args) {
		System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
		System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
		System.out.println("Is a a palindrome? " + isPalindrome("a"));
		System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
		System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
	}
}
