package treeechan.treepaech.lab2;

/**
 * This  CircleCalculator program  is to accept one arguments: radius
 * ts output format is " An area of a circle with radius of <radius of a circle>  is area
 * A circumference is Circumference "
 *
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 3, 2021
 *
 **/

public class CircleCalculator {
    public static void main(String[] args){
        float ra;
        double are,cir;
        if (args.length == 1) {
            ra = Float.parseFloat(args[0]);  // Converted from text to numbers
            if (ra >= 0) {

                are = Math.PI * Math.pow(ra, 2);    // Area = PI*radius^2
                System.out.println(String.format("An area of a circle with radius of " + args[0] + " is %.2f", are));
                cir = Math.PI * 2 * ra;    // Circumference = 2*PI*radius
                System.out.println(String.format("A circumference is %.2f", cir));
            }
            else {
                System.err.println("CircleCalculator <radius of a circle> ** NoN negative **");
                // When there is a negative value
            }
        }
        else {
            System.err.println("CircleCalculator <radius of a circle>");
            // When the number of arguments is greater than 1
        }
    }
}
