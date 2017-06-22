package simplecalculation;

import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) {
        double width, length, height;
        double numWin, winWidth, winHeight;
        double numDoor, doorWidth, doorHeight;
        double surfaceArea;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the width, length and height of the house:");
        width = in.nextDouble();
        length = in.nextDouble();
        height = in.nextDouble();
        System.out.println("Please enter the number of the windows, width and height:");
        numWin = in.nextDouble();
        winWidth = in.nextDouble();
        winHeight = in.nextDouble();
        System.out.println("Please enter the number of the door, width and height:");
        numDoor = in.nextDouble();
        doorWidth = in.nextDouble();
        doorHeight = in.nextDouble();

        surfaceArea = (width * height * 2  + length * height * 2) -
                (numWin * winWidth * winHeight + numDoor * doorHeight * doorWidth);

        System.out.printf("The painting area of the house is %5.2f", surfaceArea);
    }
}