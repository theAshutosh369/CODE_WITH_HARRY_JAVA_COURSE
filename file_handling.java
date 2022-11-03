package CWH;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling
{
    public static void main(String[] args)
    {
        // creates new file
        File f = new File("newFile.txt");
        try {
            if(f.createNewFile()){
                System.out.println(" created the file "+f.getName());
            }
        }
        catch (IOException e) {
            System.out.println(" unable to create file !!");
            e.printStackTrace();
        }

        // to write in file
        try {
            FileWriter fileWriter = new FileWriter("newFile.txt");
            fileWriter.write(" this is our first file from java course !  \n and now bye \t hello !");
            fileWriter.close();  // must hai close krna its a good practice
        }
        catch (IOException e) {
            System.out.println(" we couldnt write in the file ");
            e.printStackTrace();
        }

        // reading a file
        try {
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(" to read this file is not found !");
            e.printStackTrace();
        }

        // deleting a file
        if(f.delete())
        {
            System.out.println(" i have deleted the file "+ f.getName());
        }
        else
        {
            System.out.println(" not deleted !");
        }
    }
}
