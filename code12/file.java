import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        String sourceFileName = "input.txt";
        String targetFileName = "output.txt";
        String content = "All the best!";

        File sourceFile = new File(sourceFileName);
        if(!sourceFile.exists()) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile))) {
                writer.write(content);
                System.out.println("File 'input.txt' created with content: " + content);
            } catch(IOException e) {
                System.out.println("Error creating 'input.txt': " + e.getMessage());
                return;
            }
        }

        try(
            BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName))
        ) {
            String line;
            while((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Content copied from 'input.txt' to 'output.txt' successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file: " + e.getMessage());
        }
    }
}