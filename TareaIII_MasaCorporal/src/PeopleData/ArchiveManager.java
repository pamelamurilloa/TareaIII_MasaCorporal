/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PeopleData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pamelamurillo
 */
public class ArchiveManager {
    File usersFile;

    public void createFile(){
        usersFile = new File("usersInfo.txt");
    }
    
    
    public void writeInFile(String textToWrite) { //This can get "users" or "books", and the text you wanna write in it
        File nameFile = usersFile;
        
        try {
            
            FileWriter writer;
            writer = new FileWriter(nameFile, true);

            BufferedWriter bufferWriter = new BufferedWriter(writer);

            bufferWriter.write(textToWrite);        //writes the text
            bufferWriter.newLine();                 //Goes to the next line
            bufferWriter.close();                   //closes the file

        } catch (IOException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
