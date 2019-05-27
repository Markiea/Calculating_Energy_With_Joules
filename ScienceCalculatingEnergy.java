package com.teamtreehouse;

import javax.swing.JOptionPane;

public class ScienceCalculatingEnergy {
    public static void main(String[] args) {

        String mString = JOptionPane.showInputDialog(
                "Enter the weight of water in kilograms");

        double m = Double.parseDouble(mString);

        String initalTemperatureString = JOptionPane.showInputDialog(" What is the intial temperature of the water in celsius?");

        double intialTemperature = Double.parseDouble(initalTemperatureString);

        String finalTemperatureString = JOptionPane.showInputDialog("What is the final temperature in celsius of course?:");

        double finalTemperature = Double.parseDouble(finalTemperatureString);

        double Joules = m * (finalTemperature - intialTemperature) * 4184;

        System.out.println( " Joules in which to comput the energy is: " + Joules);


    }





}
