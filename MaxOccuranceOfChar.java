package com.mypackage;

import java.util.HashMap;

public class MaxOccuranceOfChar {
	public static Character findMaxOChar(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character maxChar = ' ';
		long max = Integer.MIN_VALUE;
		for (int i = 0; i < text.length(); i++) {
			Character current = text.charAt(i);
			if (map.containsKey(current)) {
				map.put(current, map.get(current) + 1);
			} else {
				map.put(current, 1);
			}
			if (map.get(current) > max) {
				maxChar = current;
				max = map.get(current);
			}
		}
		return maxChar;
	}

	public static void main(String args[]) {
		String text = "abaaadsabcdsffsd";
		System.out.println("The max character is : " + findMaxOChar(text));
	}
}
