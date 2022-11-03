package CWH;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        File f = new File("practice.txt");
        try{
            f.createNewFile();
            System.out.println(" we have created the file : "+ f.getName());
        }
        catch(IOException e)
        {
            System.out.println(" created the file ");
        }


        try{
            FileWriter fileWriter = new FileWriter("practice.txt");
            Scanner s = new Scanner((System.in));
            String Str = s.nextLine();
            fileWriter.write(Str);
            fileWriter.close();
            s.close();
        }
        catch(IOException e)
        {
            System.out.println(" file not found to write !! ");
        }

        try{
           Scanner s = new Scanner(f);
           while(s.hasNextLine())
           {
               String line = s.nextLine();
               System.out.println(line);
           }
            s.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(" file not found to read ! ");
        }



        if(f.delete()){
            System.out.println(" deleted the file !!"+ f.getName());
        }

    }
}
