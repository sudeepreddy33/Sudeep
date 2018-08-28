package com.mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {

		String s = "abaaadsabcdsffsd";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			Integer value = map.get(ch);
			if (value != null) {
				map.put(ch, value + 1);
			} else {
				map.put(ch, 1);
			}

		}
		Set<Character> keySet = map.keySet();
		Iterator<Character> it = keySet.iterator();
		while (it.hasNext()) {
			Character k = it.next();
			Integer v = map.get(k);

			System.out.println("The Character is " + k + "The count is" + v);

		}

	}

}
