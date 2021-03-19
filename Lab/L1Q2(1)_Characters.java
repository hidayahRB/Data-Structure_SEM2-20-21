package oop;

import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Characters {

    public static void main(String[] args) throws IOException {
    // a. Calculate the number of characters retrieved from text file without the special characters.
    // b. Display all characters from the text file without the special characters.
        
        File file1 = new File("text1.txt");
        File file2 = new File("text2.txt");
        File file3 = new File("text3.txt");
        File file4 = new File("text4.txt");
        // Count characters 
        System.out.println("Content in text1.txt");
        System.out.println("********************");
        ReadText1(file1,ReadLine(file1));
        System.out.println("Content in text2.txt");
        System.out.println("********************");
        ReadText2(file2,ReadLine(file2));
        System.out.println("Content in text3.txt");
        System.out.println("********************");
        ReadText3(file3,ReadLine(file3));
        System.out.println("Content in text4.txt");
        System.out.println("********************");
        ReadText4(file4,ReadLine(file4));
    }
    
    public static int ReadLine(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        // Read the contents of the file to a byteArray using read()
        byte[] byteArray = new byte[(int)file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] strArray = data.split("\r\n");
        return strArray.length;
    }
    
    public static int ReadCharacter(String[] word) {
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            char[] strToChar = word[i].toCharArray();
            count += strToChar.length;
        }
        return count;
    }
    
    // ReadText1
    public static void ReadText1(File file, int line) throws IOException {
        String[] row = new String[line];
        try{
            Scanner inputStream = new Scanner(new FileInputStream(file));
            // store each content per line in a string array
            for (int i=0; i<row.length; i++) {
                row[i] = Files.readAllLines(Paths.get("text1.txt")).get(i);
            }
            inputStream.close();
        }catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        // count characters in text file
        int i = row.length-1;
        int size=0;
        int occOfChar = 0;
        do{
            String character[] = row[size].split(",");
            for (int j = 0; j < character.length; j++) {
                System.out.print(character[j]+" ");
            }System.out.println();
            occOfChar += character.length;
            size++;
            i--;  
        }while(i >= 0);
        System.out.println("Characters : "+occOfChar+"\n");
    }
    
    // ReadText2
    public static void ReadText2(File file, int line) throws IOException {
        String[] row = new String[line];
        try{
            Scanner inputStream = new Scanner(new FileInputStream(file));
            // store each content per line in a string array
            for (int i=0; i<row.length; i++) {
                row[i] = Files.readAllLines(Paths.get("text2.txt")).get(i);
            }
            inputStream.close();
        }catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        // count characters in text file
        int i = row.length-1;
        int size=0;
        int ch = 0;
        do{
            String character[] = row[size].split(", ");
            for (int j = 0; j < character.length; j++) {
                System.out.print(character[j]+" ");
            }System.out.println();
            int cnt = ReadCharacter(character);
            ch += cnt;
            size++;
            i--;  
        }while(i >= 0);
        System.out.println("Characters : "+ch+"\n");
    }
    
    // ReadText3
    public static void ReadText3(File file, int line) throws IOException {
        String[] row = new String[line];
        try{
            Scanner inputStream = new Scanner(new FileInputStream(file));
            // store each content per line in a string array
            for (int i=0; i<row.length; i++) {
                row[i] = Files.readAllLines(Paths.get("text3.txt")).get(i);
            }
            inputStream.close();
        }catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        // count characters in text file
        int i = row.length-1;
        int size=0;
        int ch = 0;
        do{
            String character[] = row[size].split("; ");
            for (int j = 0; j < character.length; j++) {
                System.out.print(character[j]+" ");
            }System.out.println();
            int cnt = ReadCharacter(character);
            ch += cnt;
            size++;
            i--;  
        }while(i >= 0);
        System.out.println("Characters : "+ch+"\n");
    }
    
    // ReadText4
    public static void ReadText4(File file, int line) throws IOException {
        String[] row = new String[line];
        try{
            Scanner inputStream = new Scanner(new FileInputStream(file));
            // store each content per line in a string array
            for (int i=0; i<row.length; i++) {
                row[i] = Files.readAllLines(Paths.get("text4.txt")).get(i);
            }
            inputStream.close();
        }catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        // count characters in text file
        int i = row.length-1;
        int size=0;
        int ch = 0;
        do{
            String character[] = row[size].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            for (int j = 0; j < character.length; j+=2) {
                System.out.print(character[j]+" ");
                String letter[] = character[j].split("");
                int cnt = ReadCharacter(letter);
                ch += cnt;
            }System.out.println();  
            size++;
            i--;  
        }while(i >= 0);
        System.out.println("Characters : "+ch+"\n");
    }
}
