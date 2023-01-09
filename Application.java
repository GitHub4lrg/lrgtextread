import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException{
        TextFileService tfs = new TextFileService();
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("please input file name: ");
        String filename = fileNameScanner.nextLine();
        String contents = tfs.readStringFromFile(filename);
        System.out.println(contents);
        System.out.println("thanks for using the file reading app! Bye.");
    }
}
/**
 * Exceptions
 *  Exceptions (checked - must be handled, happen from unpredictable situations - eg Network issues)
 *  Runtime Exceptions (unchecked - do not need to be handled, developer can avoid them logically - eg divide by 0)
 * 'throws' declaration - the method is capable of transfering its exception to the method that called this one
 * try/catch block - a piece of code that can attempt a 'risky' piece of a code and has another block of code that
 *      runs when the exception is thrown
 * Custom Exceptions can be written for situations Java doesn't predict by default (eg external sensors)
 * Exceptions vs Errors - Errors happen externally to the code - eg the computer runs out of memory for Java
 * 
 */