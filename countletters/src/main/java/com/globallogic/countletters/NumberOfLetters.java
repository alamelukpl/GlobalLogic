package com.globallogic.countletters;

import java.util.Map;
import java.util.TreeMap;

public class NumberOfLetters {

	public static void main(String[] args) {
		String input = "JavaAcademy";
		countNoOfLetters(input);
	}

	private static void countNoOfLetters(String input) {
		String inputValue = input.toLowerCase(); 
		char[] charInputValue = inputValue.toCharArray();
		Map<Character, Integer> hashmap = new TreeMap<Character, Integer>();
		for (int i = 0; i < inputValue.length(); i++) {
			if (!hashmap.containsKey(charInputValue[i])) {
				hashmap.put(charInputValue[i], 1);
			} else {
				int value = hashmap.get(charInputValue[i]);
				hashmap.put(charInputValue[i], value + 1);
			}
		}
		System.out.println("Counted Letters:");
		for(Map.Entry<Character, Integer> map : hashmap.entrySet())
		{
			System.out.println( map.getKey() + " = "  + map.getValue());
		}
		
	}



}
