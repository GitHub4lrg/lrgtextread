import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * this class will contain methods that can read all sorts of different text files
 */
public class TextFileService {
/**
 * @param filename a string representing the name (relative path) of a txt file
 * @return the contents of the file represented by filename
 * @throws FileNotFoundException
 */
    public String readStringFromFile(String filename){

        File textFile = new File(filename);
        Scanner textScanner;
        String text = "";
        try {
            textScanner = new Scanner(textFile);
            text = textScanner.nextLine();
        } catch (FileNotFoundException e) {
           System.out.println("we couldn't find the file!");
        }
        return text;
    }
}