
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
        byte by = 120;   //-128 TO 127
        short sh = 32000;  //-32,768 TO 32,767
        int in = 2000000000;  //-2,147,483,648 TO 2,147,483,647
        long lo = 9000000000000000000L ; //-9,223,372,036,854,775,808 TO 9,223,372,036,854,775,807
        float fl = 1.12345F;     //1.40129846432481707e-45 TO 3.40282346638528860e+38
        double dou = 1.123456789123;   //4.94065645841246544e-324 TO 1.79769313486231570e+308
        char ch = 'a';   //Single letter
        boolean boo = true; //  true OR false

        System.out.println(boo);
        System.out.println(by);
        System.out.println(fl);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(ch);
        System.out.println(sh);
        System.out.println(dou);

    }
}
