/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ht1;

/**
 *
 * @author mahmu
 */
public class SortWords {
    public static void main(String[] args) {
        // The soliloquy from the previous question
        String soliloquy = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Extract words from the soliloquy
        String[] words = soliloquy.split("\\s+");

        // Sort words alphabetically using bubble sort
        bubbleSort(words);

        // Print the sorted words
        System.out.println("Sorted Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Bubble Sort method
    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareToIgnoreCase(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;

                    swapped = true;
                }
            }
        } while (swapped);
    }
}
