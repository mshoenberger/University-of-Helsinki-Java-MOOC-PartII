
package dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Neptrocity
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    
    private Map<String, List<String>> dictionary;
    
    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<String, List<String>>(); 
    }
    
    public void add(String word, String entry){
        if(!this.dictionary.containsKey(word)){
            dictionary.put(word, new ArrayList<String>());
        }
        dictionary.get(word).add(entry);
    }
    
    public Set<String> translate(String word){
        Set<String> translations = new HashSet<String>();
        
        if(!this.dictionary.containsKey(word)){
            return null;
        }
        
        for(String index: this.dictionary.get(word)){
            translations.add(index);
        }
        return translations;
    }
    
    public void remove(String word){
        dictionary.remove(word);
    }
    
    
    
}
