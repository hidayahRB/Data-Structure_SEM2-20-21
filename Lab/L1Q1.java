import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_17206657 {

    public static void main(String[] args) {
        String filePath = "SitiNorhidayah_17206657.txt";

        // Read file
        try{
            Scanner in = new Scanner(new FileInputStream(filePath));
            while (in.hasNextLine()) {
                System.out.println(in.nextLine()); 
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        // Append
        // Must open file into append mode by using FileReader
        
       try (FileWriter f = new FileWriter("SitiNorhidayah_17206657.txt", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) { 
           p.println("Appending text into file\n"); 
           p.println("Thursday, 18 June 2021.\n" +
           "It’s me again. Finally, it’s the end of the term and the DS class has finished! I think I did my best for thjis subject ;)\n" +
           "I manage to get A in this course for this semester. It was a roller coaster for me but I succesfully gone through it with\n ");+
           "the help from my beloved lecturers and fellow friends. "
       } catch (IOException i) { 
           System.out.println("Problem with file output"); 
       }

        // re-Read new appended file
//        try{
//            Scanner in = new Scanner(new FileInputStream(filePath));
//            while (in.hasNextLine()) {
//                System.out.println(in.nextLine()); 
//            }
//            in.close();
//        }catch(FileNotFoundException e){
//            System.out.println("File not found");
//        }
       
    }
    
}
