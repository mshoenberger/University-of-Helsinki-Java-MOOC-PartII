
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Neptrocity
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> stringStorage;
    private int duplicatesFound;
    
    public PersonalDuplicateRemover(){
        this.stringStorage = new HashSet<String>();
        this.duplicatesFound = 0;
    }
    
    public boolean isNotDuplicate(String toBeStored){
        for(String index: stringStorage){
            if(index.equals(toBeStored)){
                this.duplicatesFound++;
                return false;
            }
        }
        return true;
    }
    
    public void add(String characterString){
        if(isNotDuplicate(characterString)){
            this.stringStorage.add(characterString);
        }
    }
    
    public int getNumberOfDetectedDuplicates(){
        return this.duplicatesFound;
    }
    
    public Set<String> getUniqueCharacterStrings(){
        
        return this.stringStorage;
    }
    
    public void empty(){
        this.stringStorage.removeAll(stringStorage);
        this.duplicatesFound = 0;
        
    }
    
}
