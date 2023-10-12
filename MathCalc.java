/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ht1;

/**
 *
 * @author mahmu
 */
public class MathCalc {
    public static void main(String[] args) {
        // Diameter of the Earth in miles
        double diameterEarth = 7600.0;

        // Diameter of the Sun in miles
        double diameterSun = 865000.0;

        // Calculate the volume of the Earth in cubic miles
        double radiusEarth = diameterEarth / 2.0;
        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);

        // Calculate the volume of the Sun in cubic miles
        double radiusSun = diameterSun / 2.0;
        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);

        // Calculate the ratio of the volume of the Sun to the volume of the Earth
        double ratio = volumeSun / volumeEarth;

    
        System.out.println("Volume of the Earth: " + volumeEarth + " cubic miles");
        System.out.println("Volume of the Sun: " + volumeSun + " cubic miles");
        System.out.println("Ratio of Sun's volume to Earth's volume: " + ratio);
    }
}

