
/**
 * This  PrimitiveDataType program  is Define variable and Set variable value
 * ts output format is variable value
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 3, 2021
 *
 **/

package treeechan.treepaech.lab2;

public class PrimitiveDataType {
    public static void main(String[] args) {
        byte bytenumber = 120;   //-128 TO 127
        short shortnumber = 32000;  //-32,768 TO 32,767
        int intnumber = 2000000000;  //-2,147,483,648 TO 2,147,483,647
        long longnumber = 9000000000000000000L ; //-9,223,372,036,854,775,808 TO 9,223,372,036,854,775,807
        float floatnumber = 1.12345F;     //1.40129846432481707e-45 TO 3.40282346638528860e+38
        double doublenumber = 1.123456789123;   //4.94065645841246544e-324 TO 1.79769313486231570e+308
        char letter = 'a';   //Single letter
        boolean bool = true; //  true OR false

        System.out.println(bool);
        System.out.println(bytenumber);
        System.out.println(floatnumber);
        System.out.println(intnumber);
        System.out.println(longnumber);
        System.out.println(letter);
        System.out.println(shortnumber);
        System.out.println(doublenumber);

    }
}
