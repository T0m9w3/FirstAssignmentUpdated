package comp.comp152;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExampleA{

    public static void main(String[] args) throws Exception{
        var fileName = "Students.txt";
        var allLines = Files.readString(Paths.get(fileName));
        var listOfNames = allLines.split("\n");
        for (String Name: listOfNames){
            System.out.println(Name);
        }
    }
}
