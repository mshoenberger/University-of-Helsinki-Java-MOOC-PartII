
package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Neptrocity
 */
public class MindfulDictionary {
    
    private Map<String, String> FinnishToEnglish;
    private Map<String, String> EnglishToFinnish;
    
    public MindfulDictionary(){
        this.FinnishToEnglish = new HashMap<String, String>();
        this.EnglishToFinnish = new HashMap<String, String>();
    }
    
    private File dictionaryFile;
    private Scanner reader;
    private FileWriter writeToFile;
    
    public MindfulDictionary(String file)throws FileNotFoundException{
        this();
        this.dictionaryFile = new File(file);
    }

    public void add(String word, String translation){
        if(!this.EnglishToFinnish.containsKey(word) && !this.FinnishToEnglish.containsKey(word)){
            this.FinnishToEnglish.put(word, translation);
            this.EnglishToFinnish.put(translation, word);
        }
    }

    public String translate(String word){
        
        if(this.EnglishToFinnish.containsKey(word)){
            return this.EnglishToFinnish.get(word);
        }else if(this.FinnishToEnglish.containsKey(word)){
            return this.FinnishToEnglish.get(word);
        }else{
            return null;
        }

    }
    
    public void remove(String word){
        
        if(this.EnglishToFinnish.containsKey(word)){
            this.FinnishToEnglish.remove(this.EnglishToFinnish.get(word));
            this.EnglishToFinnish.remove(word);
        }else if(this.FinnishToEnglish.containsKey(word)){
            this.EnglishToFinnish.remove(this.FinnishToEnglish.get(word));
            this.FinnishToEnglish.remove(word);
        }
    }
    
    public boolean load(){
        
        try{
            this.reader = new Scanner(this.dictionaryFile);
        
            while(this.reader.hasNext()){
                String line = reader.nextLine();
                String[] stringParts = line.split(":");
            
                add(stringParts[0], stringParts[1]);
            }
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean save(){
        
        try{
            this.writeToFile = new FileWriter(this.dictionaryFile);
            for(String index: this.FinnishToEnglish.keySet()){
                String translated = this.FinnishToEnglish.get(index);
                this.writeToFile.write(index + ":" + translated +"\n");
            }
            this.writeToFile.close();
        }catch(Exception IOException){
            return false;
        }
        return true;       
    }

}
