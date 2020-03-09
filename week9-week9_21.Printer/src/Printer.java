/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Printer{
    
    private Scanner reader;
    private File inputFile;
    private ArrayList<String> lines;
    private int track;
    
    public Printer(String filename) throws Exception{
        inputFile = new File(filename);
        reader = new Scanner(inputFile);
        lines = new ArrayList<String>();
        this.track = 0;
    }
    
    public void addLines(){
        while(reader.hasNext()){
            String tempLineStorage = reader.nextLine();
            lines.add(tempLineStorage);
        }
    }
    
    public void printLinesWhichContain(String word){
        
        addLines();

        if(word.equals("")){
            printBlankInput();
        }else{
           printNoBlank(word);
        }   
    }
      
    public void printBlankInput(){
        
        for(String index: lines){
            System.out.println(index);
        }
    }

    public void printNoBlank(String word){
             
        for(String index: lines){
            if(index.contains(word)){
                System.out.println(index);
            }
        }
    }
    
    
}
