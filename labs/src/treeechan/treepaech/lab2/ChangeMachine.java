package treeechan.treepaech.lab2;

public class ChangeMachine {
    public static void main(String[] args){
        if (args.length == 4 ){
           int n1 = Integer.parseInt(args[0]);
           int n2 = Integer.parseInt(args[1]);
           int n5 = Integer.parseInt(args[2]);   // Converted from text to numbers
           int n10 = Integer.parseInt(args[3]);

             if (n1 >= 0 & n2 >= 0 & n5 >= 0 & n10 >= 0){
                 int Sum = n1+(n2*2)+(n5*5)+(n10*10);  // Calculate total money
                 int n1000,n500,n100,n20,remain;
                 System.out.println("1-bath cions : "+args[0]);
                 System.out.println("2-bath cions : "+n2);
                 System.out.println("5-bath cions : "+n5);
                 System.out.println("10-bath cions : "+n10);
                 System.out.println("Total amount : "+Sum);   //  Total money

                 n1000 = Sum/1000;                 // Calculate bill 1000 baht
                 n500 = (Sum%1000)/500;           // Calculate bill 500 baht
                 n100 = (Sum%1000%500)/100;      // Calculate bill 100 baht
                 n20 = (Sum%1000%500%100)/20;   // Calculate bill 20 baht
                 remain = Sum%1000%500%100%20; // Calculate remaining balance

                 System.out.println("1000-bill : "+n1000);
                 System.out.println("500-bill : "+n500);
                 System.out.println("100-bill : "+n100);
                 System.out.println("20-bill : "+n20);
                 System.out.println("Money remain : "+remain);
             }
             else   {
                 System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <1B-baht coins> ** NoN negative **");
                 // When there is a negative value
             }
        }
        else   {
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <1B-baht coins>");
            // When all the arguments have not been added or the specified number has not been reached
        }
    }
}
