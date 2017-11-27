import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class wordCount1 {
	public static void main(String[] args) {
		// anagram(new String[] {});
	}
	// given an array of strings, return a Map<String, Integer> with a key for each
	// different string,
	// with the value the number of times that string appears in the array.

	public Map<String, Integer> wordCount2(String[] strings) {

		Map<String, Integer> s1 = new HashMap<String, Integer>();

		for (String s : strings) {
			if (!s1.containsKey(s)) {
				s1.put(s, 1);
			} else {
				int count = s1.get(s);
				s1.put(s, count + 1);
			}
		}
		return s1;

	}
	// Given an array of strings, return a Map<String, Integer> containing a key for
	// every
	// different string in the array, always with the value 0

	public Map<String, Integer> wordCount3(String[] strings) {

		Map<String, Integer> s2 = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {
			String a = strings[i];
			s2.put(a, 0);

		}
		return s2;
	}
	// Given a list of numbers, find the longest subsequence of consecutive positive
	// integers

	public static ArrayList<Integer> positiveSubsequence(int[] args) {

		ArrayList<Integer> current = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < args.length; i++) {
			if (args[i] > 0) {
				current.add(args[i]);

			} else {
				if (current.size() > result.size()) {
					result = current;
				}
				current.clear();
			}

		}
		return result;

	}

	// Write a function to check if the given STRING is a palindrome or not.
	// A palindrome is a word, phrase, number, or other sequence of characters which
	// reads the same backward as forward

	public static boolean palindrome(String[] args) {

		int n = args.length;
		boolean isPalindrome = true;

		for (int i = 0; i < n / 2; i++) {
			if (args[i] != args[(n - i - 1)]) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome == true) {
			// System.out.println("String is a palindrome");
		} else {

			// System.out.println("String is not a palindrome");
		}
		return isPalindrome;
	}

	// Write a function that checks whether an INTEGER ARRAY is a palindrome or not

	public static boolean palindrome2(String[] args) {

		int n = args.length;
		boolean isPalindrome = true;
		for (int i = 0; i < n / 2; i++) {
			if (args[i] != args[(n - i - 1)]) {
				isPalindrome = false;
				break;
			} else {
			}

		}
		return isPalindrome;
	}

	// Find duplicate characters in a String and count the number of occurrences of
	// the duplicate characters

	public static void duplicate(String[] args) {

	}
	// Remove duplicate characters in a string: Given a string "banana", return
	// unique string "ban"

	public static String removeDuplicate(String arg) {

		String result = "";
		Map<String, String> dup = new HashMap<String, String>();

		for (int i = 0; i < arg.length(); i++) {
			String s = arg.charAt(i) + "";
			if (!dup.containsKey(s)) {
				result += s;
				dup.put(s, null);
			}

		}

		return result;
	}

	// Given two strings "parachute" and "raphtueac", determine if 2 strings are
	// anagrams of each other (both the strings have same set of characters)

	public static boolean anagram(String s1, String s2) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				int occurance = map.get(s1.charAt(i));
				occurance += 1;
				map.put(s1.charAt(i), occurance);

			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (map.containsKey(s2.charAt(i))) {
				int occurance = map.get(s2.charAt(i));
				if (occurance == 1) {
					map.remove(s2.charAt(i));

				} else {
					occurance -= 1;
					map.put(s2.charAt(i), occurance);
				}
			} else {

				return false;
			}

		}
		if (!map.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}