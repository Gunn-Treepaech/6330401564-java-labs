
/**
 * This  CamelCaseNaming program  is to accept two arguments: first word , second word
 * ts output format is " The first word is   <First word>
 *                       The second word is  <Second word>
 *                       The concatenate with camel case is concatenate word "
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 3, 2021
 *
 **/

package treeechan.treepaech.lab2;

public class CamelCaseNaming {
    public static void main(String[] args){
       String[] newstring = new String[3];
       String[] lowtxt = new String[3],fwletter = new String[3], bigchart = new String[3];
       if (args.length == 2) {
           for (int i = 0; i < 2 ; i++){
               lowtxt[i] = args[i].toLowerCase();        // Make all letters lowercase
               fwletter[i] = lowtxt[i].substring(0, 1);       // Separate only the first from the text
               bigchart[i] = fwletter[i].toUpperCase();            // Capitalize the text
               newstring[i] = bigchart[i] + lowtxt[i].substring(1);  // Put back together
           }
           System.out.println("The first word is " + args[0]);
           System.out.println("The second word is " + args[1]);
           System.out.println("The concatenate with camel case is "+(newstring[0] + newstring[1]));// Bringing the two messages together
       }
       else {
           System.err.println("CamelCaseNaming : <First word> <Second word>");
           // When argument is not equal to 2
       }
    }
}
