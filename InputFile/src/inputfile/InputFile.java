/*

 */
package inputfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputFile {

   
    public static void main(String[] args) {
        
        File file = new File ("txt");
        try {
            Scanner input = new Scanner (file);
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
