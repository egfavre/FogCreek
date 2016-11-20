package com.egfavre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz_";
    final static String FILE_NAME = "FogCreekText.txt";
    static String text = "";

    public static void main(String[] args) throws FileNotFoundException {

        char[] alphabetArray = ALPHABET.toCharArray();

        File fileText = new File(FILE_NAME);
        Scanner fileScanner = new Scanner(fileText);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            text = text + line;
        }

        TreeMap<Character, Integer> letterFrequency = new TreeMap<Character, Integer>();

        for (char alpha : alphabetArray) {
            int frequency = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == alpha) {
                    frequency++;
                }
                letterFrequency.put(alpha, frequency);
            }
        }

        letterFrequency.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
    }

}
