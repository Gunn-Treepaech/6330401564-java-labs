package treeechan.treepaech.lab2;

/**
 * This  Patient program  is to accept three arguments: name, age , city name
 * ts output format is " Patient's name is <patient name> Patient's age is
 * <patient age> <patient name>  come from <country>"
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 3, 2021
 *
 **/


public class Patient {
    public static void main(String[] args){
        if (args.length == 3){
        System.out.println("Patient's name is "+args[0]); // Takes the 1st argument to display.
        System.out.println("Patient's age is "+args[1]);  // Takes the 2nd argument to display.
        System.out.println(args[0]+" come from "+args[2]); // Takes the 1st argument and the 3rd to display.
        }
        else {
            System.err.println("Paient <patient name> <patient age> <country>");
            // when the number of arguments is less than 3 or greater than 3.
        }

    }
}
