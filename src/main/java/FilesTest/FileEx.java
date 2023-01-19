package FilesTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.readAllLines;

public class FileEx {


    public static void main(String[] args) throws IOException {
        File file = new File("files/testfile.txt");

        file.exists();

        List<String> lines = Files.readAllLines(file.toPath());
        System.out.println(lines);
        lines = new ArrayList<>();
        lines.add("test s 1");
        lines.add("test s 2");
        lines.add("test s 3 ");

        Files.write(file.toPath(), lines);
        System.out.println(lines);



    }
}
