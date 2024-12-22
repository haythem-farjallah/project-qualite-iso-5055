package haythem.cwe1091;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("example.txt");
            fileHandler.writeData("Hello, World!");
            // Forgot to close the file, leading to potential resource leak
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private FileWriter writer;

    public FileHandler(String filename) throws IOException {
        writer = new FileWriter(filename);
        System.out.println("File opened for writing.");
    }

    public void writeData(String data) throws IOException {
        writer.write(data);
    }

    // No close() method or finalize() method to release the resource
}



