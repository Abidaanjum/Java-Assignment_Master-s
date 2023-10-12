/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ht1;

/**
 *
 * @author mahmu
 */
public class PrimesImproved {
    public static void main(String[] args) {
        int nValues = 50;

        outerLoop: 
        for (int i = 2; i <= nValues; i++) {
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue outerLoop; 
                }
            }

            System.out.println(i);
        }
    }
}
