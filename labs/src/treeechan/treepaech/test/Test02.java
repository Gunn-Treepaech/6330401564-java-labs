package treeechan.treepaech.test;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public class Test02 {
        public static void main(String[] args) {
            try {
                Path file = Paths.get("D:\\example2.txt");
                BufferedWriter writer = Files.newBufferedWriter(file,
                        StandardCharsets.UTF_8, StandardOpenOption.APPEND);

                for (int i = 10; i < 20; i++) {
                    writer.write("This is content line " + (i + 1));
                    writer.newLine();
                }

                writer.close();
            } catch (IOException e) {
                System.err.println("IOException: " + e.getMessage());
            }
    }
}
