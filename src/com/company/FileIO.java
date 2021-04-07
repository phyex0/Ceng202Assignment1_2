/*
    Halit Burak Yeşildal
    18050111043
 */

package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileIO {


    public static void readFile() {
        String line=null;
        try {
            File f = new File("src/com/company/palindromes.txt");

            if(!f.exists())
                f.createNewFile();

            FileReader fr= new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while((line=br.readLine())!=null)
                WordOperations.isPalindrome(line);

            br.close();
            fr.close();

        }catch (Exception e){
            System.out.println("Excetpion...");
        }
    }
}
