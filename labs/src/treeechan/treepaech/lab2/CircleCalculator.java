package treeechan.treepaech.lab2;

public class CircleCalculator {
    public static void main(String[] args){
        float ra;
        double are,cir;
        if (args.length == 1){
            ra = Float.parseFloat(args[0]);  // Converted from text to numbers
            are = Math.PI*Math.pow(ra,2);    // Area = PI*radius^2
            System.out.println(String.format("An area of a circle with radius of "+args[0]+" is %.2f",are));
            cir = Math.PI*2*ra;    // Circumference = 2*PI*radius
            System.out.println(String.format("A circumference is %.2f",cir));
        }
        else {
            System.err.println("CircleCalculator <radius of a circle>");
            // When the number of arguments is greater than 1
        }
    }
}
