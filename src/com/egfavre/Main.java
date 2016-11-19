package com.egfavre;

import com.sun.tools.javac.tree.JCTree;
import com.sun.xml.internal.fastinfoset.util.CharArray;
import com.sun.xml.internal.ws.util.StringUtils;
import javafx.collections.transformation.SortedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String alphabet = "abcdefghijklmnopqrstuvwxyz_";
        char[] alphabetArray = alphabet.toCharArray();

        File fileText = new File("FogCreekText.txt");
        Scanner fileScanner = new Scanner(fileText);
        String text = "";
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            text = text + line;
        }

        System.out.println(alphabetArray);
        System.out.println(text);
        System.out.println("text has " + text.length() + " characters.");

        HashMap<Character, Integer> letterFrequency = new HashMap<Character, Integer>();

        for (char alpha : alphabetArray) {
            int frequency = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == alpha) {
                    frequency++;
                }
                letterFrequency.put(alpha, frequency);
            }
        }
        System.out.println(letterFrequency);
    }
}
