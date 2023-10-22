package org.example.ejercicios;

import constants.Constants;
import model.RectangleDimensionModel;

//This is the main class
public class CalculatePerimeterRectangleMain {
    //This is a method to calculate a rectangle perimeter
    public static Double calculatePerimeterRectangle(double width, double length) {
        if (width != 0.0 && length != 0) {
            return (2 * width + 2 * length);
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Constants.LOGGER.info("The main class is being executed to calculate the perimeter of a rectangle");
        RectangleDimensionModel rectangleOne = new RectangleDimensionModel(4D, 7.0);

        System.out.println("--------Rectangle perimeter---------");
        System.out.println("The rectangle perimeter is: " + calculatePerimeterRectangle(rectangleOne.width(), rectangleOne.length()));
    }
}
