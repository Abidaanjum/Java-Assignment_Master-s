/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ht1;

/**
 *
 * @author mahmu
 */
public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0,
            vowels = 0,
            letters = 0;

        // Loop through each character in the text
        for (char ch : text.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                letters++;

                // Check if the letter is a vowel
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels++;
                }
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        // Print the results
        System.out.println("The text contained vowels: " + vowels + "\n" +
                "consonants: " + (letters - vowels) + "\n" +
                "spaces: " + spaces);
    }
}
