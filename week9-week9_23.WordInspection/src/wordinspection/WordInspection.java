/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Neptrocity
 */
public class WordInspection {
    
    private Scanner reader;
    private ArrayList<String> fileLines;
    private boolean alreadyAdded;
    
    public WordInspection(File file) throws Exception{
        this.reader = new Scanner(file, "UTF-8");
        this.fileLines = new ArrayList<String>();
        this.alreadyAdded = false;
    }
    
    public void addWords(){
        while(reader.hasNext()){
            fileLines.add(reader.nextLine());
        }
        this.alreadyAdded = true;
    }
    
    public void checkIfNeedToAdd(){
        if(!this.alreadyAdded){
            addWords();
        }
    }
    
    
    public int wordCount(){
        checkIfNeedToAdd();
        return fileLines.size();
    }
    
    public List<String> wordsContainingZ(){
        checkIfNeedToAdd();
        List<String> zWords = new ArrayList<String>();
        
        for(String index: fileLines){
            if(index.contains("z")){
                zWords.add(index);
            }
        }
        return zWords;
    }
    
    
    
}
