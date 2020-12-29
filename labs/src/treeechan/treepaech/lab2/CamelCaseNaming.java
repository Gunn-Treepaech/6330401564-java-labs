package treeechan.treepaech.lab2;

public class CamelCaseNaming {
    public static void main(String[] args){
       String msgfi,bigmsgfi,msgse,bigmsgse,lowtxt1,lowtxt2;
       String newfi,newse;

       if (args.length == 2) {
           lowtxt1 = args[0].toLowerCase();   // Make all letters lowercase
           msgfi = lowtxt1.substring(0, 1);   // Separate only the first from the text
           bigmsgfi = msgfi.toUpperCase();   // Capitalize the text
           newfi = bigmsgfi + lowtxt1.substring(1);  // Put back together
           lowtxt2 = args[1].toLowerCase();
           msgse = lowtxt2.substring(0, 1);
           bigmsgse = msgse.toUpperCase();
           newse = bigmsgse + lowtxt2.substring(1);
           System.out.println(newfi + newse);   // Bringing the two messages together
       }
       else {
           System.err.println("CamelCaseNaming : <First word> <Second word>");
           // When argument is not equal to 2
       }
    }
}
