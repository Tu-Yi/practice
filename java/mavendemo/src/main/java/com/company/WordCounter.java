package com.company;

import java.util.HashMap;

public class WordCounter {

    public HashMap count(String input) {
        char[] arr = input.toCharArray();

        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        for (char c : arr) {

            counts.put(c, !counts.containsKey(c) ? 1 : (counts.get(c) + 1));

        }
        return counts;
    }
}
