/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Neptrocity
 */
public class Analysis {
    
    private Scanner reader;
    private ArrayList<String> scriptLines;
    private boolean addedYet;
    
    public Analysis(File file) throws Exception{
        this.reader = new Scanner(file);
        this.scriptLines = new ArrayList<String>();     
        this.addedYet = false;
    }
    
    public void addToArray(){
        while(reader.hasNext()){
            String userLine = reader.nextLine();
            scriptLines.add(userLine);
        }
    }
    
    public int lines(){
        checkIfAdded();
        return scriptLines.size();
    }

    
    public int characters(){
        checkIfAdded();
        int totalChars = 0;
        for(String index: scriptLines){
            totalChars += index.length();
        }
        totalChars += scriptLines.size();
        return totalChars;
        
    }
    
    
    public void checkIfAdded(){
        if(this.addedYet == false){
            addToArray();
            this.addedYet = true;
        }
    }
    
    
}
